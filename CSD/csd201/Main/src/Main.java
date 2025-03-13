
public class Main {

    public Main() {
    }

    //1
    static class Employee {

        int id;
        String name;
        String department;
        int seniority;

        public Employee(int id, String name, String department, int seniority) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.seniority = seniority;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getSeniority() {
            return seniority;
        }

        public void setSeniority(int seniority) {
            this.seniority = seniority;
        }

        @Override
        public String toString() {
            return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", seniority=" + seniority + '}';
        }

    }

    //2
    static class Node {

        Employee info;
        Node left, right;

        Node(Employee x, Node p, Node q) {
            info = x;
            left = p;
            right = q;
        }

        Node(Employee x) {
            this(x, null, null);
        }
    }

    //3
    public static class BinarySearchTree {

        Node root;
        int index = 0;

        public BinarySearchTree() {
            root = null;
        }

        boolean isEmpty() {
            return root == null;
        }

        void createArrayAndSort(Employee[] arr, Node root) {
            int index1 = 0;
            if (root == null) {
            } else {
                createArrayAndSort(arr, root.left);
                arr[index1++] = root.info;
                createArrayAndSort(arr, root.right);
            }
        }

        void balanceTree() {
            Employee[] keyArr = new Employee[50];
            createArrayAndSort(keyArr, root);
            System.out.println("Node after being rearranged: ");
            for (Employee i : keyArr) {
                System.out.println(i);
            }
            root = null;
        }
 
        //3.4        
        Node delete(Node root, int x) {
            // Find the node has the key equal to id:
            if (isEmpty()) {
                System.out.println("Tree is empty!");
                return null;
            }
            if (x < root.info.getId()) {
                root.left = delete(root.left, x);
            } else if (x > root.info.getId()) {
                root.right = delete(root.right, x);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                Node nodeMinRight = findMinRight(root);
                root.info = nodeMinRight.info;
                root.right = delete(root.right, nodeMinRight.info.getId());
            }
            return null;
        }

        Node findMinRight(Node current) {
            current = current.right;
            Node currentParent = current;
            while (current.left != null) {
                currentParent = current;
                current = current.left;
            }
            currentParent.left = null;
            return current;
        }
//3.1

        void insert(int id, String name, String department, int seniority) {
            if (isEmpty()) {
                root = new Node(new Employee(id, name, department, seniority));
                return;
            }
            Node p = root;
            while (p != null) {
                if (p.info.getId() == id) {
                    System.out.println("The key exists.");
                    return;
                }
                if (id < p.info.getId()) {
                    if (p.left == null) {
                        p.left = new Node(new Employee(id, name, department, seniority));
                        return;
                    }
                    p = p.left;
                } else {
                    if (p.right == null) {
                        p.right = new Node(new Employee(id, name, department, seniority));
                        return;
                    }
                    p = p.right;
                }
            }
        }

        //3.2
        void inOrder(Node root) {
            if (root == null) {
                return;
            } else {
                inOrder(root.left);
                System.out.println(root.info + " ");
                inOrder(root.right);
            }
        }

        //3.3
//        void search(String x) {
//            if (isEmpty()) {
//                System.err.println("Tree is empty");
//            } else {
//                Node current = root;
//                while (current != null) {
//                    if (current.info.getName().equals(x)) {
//                        System.out.println("Key " + x + " exists");
//                        return;
//                    }
//                    if (current.info.getId()) {
//                        current = current.left;
//                    } else {
//                        current = current.right;
//                    }
//                }
//                System.err.println("Key " + x + " does not exist");
//            }
//        }




        //3.5
        int height(Node root) {
            if (root == null) {
                return -1; //base case
            }
            int leftH = height(root.left);
            int rightH = height(root.right);
            if (leftH > rightH) {
                return leftH + 1;
            } else {
                return rightH + 1;
            }
        }

        int balanceFactor(Node root) { //do chenh lech chieu cao
            return (height(root.left)) - (height(root.right));
            /*
        return so am neu nang hon o ben trai
        return so duong neu nang hon o ben phai 
             */
        }

        void checkBalance() {
            System.out.println("Height: " + height(root));
            if (balanceFactor(root) >= 2 || balanceFactor(root) <= -2) { //truong hop subtree nang hon ve ben phai
                System.err.println("The tree is not balanced");
            } else {
                System.out.println("The tree is balanced");
            }
        }
    }

    //main method
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(104, "Nam Nguyen", "HR", 5);
        bst.insert(102, "Linh Phan", "IT", 1);
        bst.insert(103, "Minh Le", "Finance", 3);
        bst.insert(101, "Ngoc Nguyen", "IT", 6);
        bst.insert(107, "Huong Pham", "Finance", 3);
        bst.insert(106, "Tuan Tran", "Finance", 2);
        bst.insert(108, "Hang Le", "IT", 4);
        bst.insert(105, "Hung Nguyen", "IT", 5);
        bst.inOrder(bst.root);
        bst.checkBalance();
        bst.delete(bst.root, 108);
        bst.inOrder(bst.root);
        bst.checkBalance();

    }

}

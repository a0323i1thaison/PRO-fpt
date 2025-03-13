
import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {

    Node root;
    int index = 0;

    public BinarySearchTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

//    void insert(int x) {
//        if (root == null) {
//            root = new Node(x);
//        } else {
//            Node f, p;
//            p = root;
//            f = null;
//            while (p != null) {
//                if (p.info == x) {
//                    System.out.println("Value " + x + " already exists");
//                    return;
//                } else {
//                    f = p;
//                    if (x < p.info) {
//                        p = p.left;
//                    } else {
//                        p = p.right;
//                    }
//
//                }
//            }
//            if (x < f.info) {
//                f.left = new Node(x);
//            } else {
//                f.right = new Node(x);
//            }
//        }
//    }
    void insert(int x) {
        if (root == null) {
            root = new Node(x);
            return;
        }
        Node f, p;
        p = root;
        f = null;
        while (p != null) {
            if (p.info == x) {
                System.err.println(" The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (x < f.info) {
            f.left = new Node(x);
        } else {
            f.right = new Node(x);
        }
    }
    
    void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.info + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.info + " ");
        }
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.info + " ");
            inOrder(root.right);
        }
    }

    void breadthFirst(Node root) {
        if (root == null) {
            return;
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node c = q.poll();
                System.out.print(c.info + " ");
                if (c.left!=null) q.add(c.left);
                if (c.right!=null) q.add(c.right);
            }
        }
    } 
    
    void search(int x){
        if (isEmpty()) System.err.println("Tree is empty");
        else {
            Node current = root;
            while(current!=null){
                if (current.info==x) {System.out.println("Key "+x+" exists");
                return;
                }
                if (current.info>x) current=current.left;
                else current = current.right;
            }
            System.err.println("Key "+x+" does not exist");
        }
    }
    
    void arrayAndSort(int[] array, Node root){
        if(root==null){
            return;
        }
        else
        {
            arrayAndSort(array, root.left);
            array[index++] = root.info;
            arrayAndSort(array, root.right);
        }
    }
    
    void balance(){
        int[] infoArray = new int[20];
        arrayAndSort(infoArray,root);
        System.out.println("Results:");
        for (int i=0;i<index;i++){
            System.out.print(infoArray[i] + " ");
        }
        System.out.println();
        root =null;
        balance(infoArray, 0 , index-1);
    }
    
    void balance(int data[], int first, int last){
        if (first<=last){
            int middle = (first+last)/2;
            insert(data[middle]);
            balance(data, first, middle-1);
            balance(data, middle+1, last);
        }
    }
    
    int height(Node root){
        if (root==null) return -1; //base case
        int leftH = height(root.left);
        int rightH = height(root.right);
        if (leftH>rightH) return leftH+1;
        else return rightH+1;
    }
    
    int balanceFactor(Node root){ //do chenh lech chieu cao
        return (height(root.left)) - (height(root.right));
        /*
        return so am neu nang hon o ben trai
        return so duong neu nang hon o ben phai 
        */
    }
    
    Node rotateRight(Node root){
        Node temp1 = root; //x 
        Node temp2 = root.left; //y
        
        temp1.left = temp2.right; //switch hai node
        temp2.right = temp1;
        
        return temp2; //node y len root
    }
    
    Node rotateLeft(Node root){
        Node temp1 = root; //x 
        Node temp2 = root.right; //y
        
        temp1.right = temp2.left; //switch hai node
        temp2.left = temp1;
        
        return temp2; //node y len root
    }    
    
    void balanceByRotating(){
        System.out.println("Height: "+height(root));
        if (balanceFactor(root)>=2) { //truong hop subtree nang hon ve ben trai
            
            if(balanceFactor(root.left)<0){
                root.left = rotateLeft(root.left);
            }
            root = rotateRight(root);
        } //
        
        if(balanceFactor(root)<=-2){ //truong hop subtree nang hon ve ben phai
            if (balanceFactor(root.right)>0){
                root.right = rotateRight(root.right);
            }
            root = rotateLeft(root);
        }
    }
}

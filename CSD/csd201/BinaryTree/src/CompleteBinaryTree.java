
import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {

    Node root;

    public CompleteBinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void insert(int x) { //breadth-first insertion
        if (isEmpty()) {
            root = new Node(x);
            return;
        }

        Queue<Node> nQueue = new LinkedList<>();
        nQueue.add(root);
        while (!nQueue.isEmpty()) {
            Node c = nQueue.poll();
            if (c.left == null) {
                c.left = new Node(x);
                return;
            } else {
                nQueue.add(c.left);
            }
            if (c.right == null) {
                c.right = new Node(x);
                return;
            } else {
                nQueue.add(c.right);
            }
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
}

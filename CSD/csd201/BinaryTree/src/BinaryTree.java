
public class BinaryTree {

    Node root;
    
    public BinaryTree() {
        root = null;
    }
    
    Node insert(Node root, int info) {
        if (root == null) { //empty case
            return new Node(info);
        }
        if (root.left == null) { //check left child
            root.left = insert(root.left, info);
        } else if (root.right == null) { //check right child
            root.right = insert(root.right, info);
        } else { //when left and right are occupied
            root.left = insert(root.left, info);
        }
        return root;
    }
    
    void preOrder(){}
    void postOrder(){}
    void breadthFirst(){}
}
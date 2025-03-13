


public class TestBinSearchTree {

    public TestBinSearchTree() {
    }
    
    public static void main(String [] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(100);
        bst.insert(50);
        bst.insert(150);
        bst.insert(30);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.preOrder(bst.root);
        bst.balanceByRotating();
        System.out.println();
        bst.preOrder(bst.root);
    }

}
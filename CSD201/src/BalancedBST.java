/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thais
 */
public class BalancedBST {



    class Node{
        int data;
        Node left, right;
        public Node(int x, Node left, Node right){
            this.data = x;
            this.left = left;
            this.right = right;
        }
        
        public Node(int x){
            this(x, null, null);
        }
        
    }
    int capacity = 20, lastIdx = -1;
    
    Node[] nodes = new Node[this.capacity];
    Node root;
    boolean isEmpty(){
        return  root == null;
    }
    
    Node insertRec( int x, Node node){
        
        if(node == null)return new Node(x);
        if(node != null){
            if(node.data > x) node.left = insertRec(x, node.left);
            if(node.data < x) node.right = insertRec(x, node.right);
        }
        return node ; 
    }
    void insertRec(int x){
        root = insertRec(x, root);
    }
    void savetoArray(Node node, Node[] arrayToSave){
        if(node == null) return;
        //visit left child
        savetoArray(node.left, arrayToSave);
        //visit node
        arrayToSave[++lastIdx] = node;
        //visit right child
        savetoArray(node.right, arrayToSave);
    }
    void balance(){
            savetoArray(root, nodes);
            for(int i=0;i <= lastIdx;i++){
                System.out.println(nodes[i].data+" ");
        }
            root = null;//delete the old tree
    }
    void balance(Node[] nodes,int fIdx, int lIdx){
        if(fIdx > lIdx)return;
        if(fIdx <= lIdx){
            int mid = (fIdx + lIdx)/2;
            insertRec(nodes[mid].data);
            balance(nodes,fIdx,mid-1);
            balance(nodes, mid+1, lIdx);
        }
    }
     int height(Node node) {
    if(node == null)return 0;
  
        return 1 +maxInt(height(node.left), height(node.right));
    }
    int height(){
        return height(root);
    }
    int maxInt(int a, int b){
        return a > b ? a:b;
    }
    int getBalance(Node node){
        return height(node.left)- height(node.right);
    }
    Node balanceRot(Node node){
        int balanceFlag = getBalance(node);
        if(balanceFlag<-1){//right subtree is higher than left subtree
            if(getBalance(node.right )>0){
                // left subtree oof right child higher right subtree
                node.right = rightRotate(node.right);
            }
            node=leftRotate(node);
    }
    return node;
}
    Node insertBalance(int x, Node node){
       if(node == null) return new Node(x);
       else{
           if(node.data > x) node.left = insertRec(x, node.left);
           if(node.data < x) node.right = insertRec(x, node.right);
       }
       node = insertRec(x, node);
       int balanceFactor = getBalance(node);
        if (balanceFactor<-1) {
            if(getBalance(node.right)>0){
node.right = rightRotate(node.right);
            }
            node=leftRotate(node);
        }
       return node;
    }
    void balanceRot(){
        root =  balanceRot(root);
        System.out.println("root.data"+root.data);
    }
    Node leftRotate(Node node){
        Node newRoot = node.right;
        Node temp = newRoot.left;
        newRoot.left= node;
        node.right = temp;
        return newRoot;
        
    }
    
    Node rightRotate(Node node){
        Node newRoot = node.left;
        Node temp = newRoot.right;
        newRoot.right= node;
        node.left = temp;
        return newRoot;
    }
    
     void preOrder(Node node){
         if (isEmpty()) System.out.println("empty");
         else{
             preOrder(root);
         } 
        
     }
    void inOrder(BinarySearchTree.Node node) {
        if (node == null) return; // base case
        // visit left child
        inOrder(node.left);
        // visit node
        System.out.print(node.data + " ");
        // visit right child
        inOrder(node.right);
    }

    void inOrder(Node node) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            inOrder(root);
        }
    }
}


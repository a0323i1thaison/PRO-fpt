/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thais
 */
public class BinarySearchTree {
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
    Node root;
    
    public BinarySearchTree(){
        this.root = null;
    }
    boolean isEmpty(){
       return root == null;
    }
     void insert(int x) {

       if(isEmpty()){
           root = new Node(x);return;
       }
       Node current = root;
       while(current !=null){
           if(current.data>x){
             if(current.left != null)  current = current.left;
             else{   
                 current.left = new Node(x);
                 return;
           }
       }
           else if (current.data<x){//check if there is a right child. go to the right
               if(current.right !=null)current = current.right;
               else{
                   current.right = new Node(x);// when the right child is null
                   return;
               }
               
           }
           else return;
    }
    
}   
     void preOrder(Node node){
        if(node == null)return; ///basecase
        if(node != null){
            //visit noode
            System.out.println(node.data + "");
            //visit left child
            preOrder(node.left);
            //visit right child
            preOrder(node.right);
        }
         
    }
    void preOrder(){
         if (isEmpty()) System.out.println("empty");
         else{
             preOrder(root);
         } 
        
     }
    void inOrder(Node node) {
        if (node == null) return; // base case
        // visit left child
        inOrder(node.left);
        // visit node
        System.out.print(node.data + " ");
        // visit right child
        inOrder(node.right);
    }

    void inOrder() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            inOrder(root);
        }
    }
    Node insertRec( int x, Node node){
        /*
       implement insert function using recursion
        */
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
    void deleteTree(){
        root = null;
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
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thais
 */
public class ArrayBinaryTree {
    
    class Node{
        int data;
        public Node (int x){
            this.data=x;
        }
    }
    int length , capacity ;
    Node[] arrayNode ;

    /**
     *
     */
    public ArrayBinaryTree(){
        this.length = 0;
        this.capacity = capacity ;
        this.arrayNode = new Node[capacity];
    }
    
    public ArrayBinaryTree(){
        this(7);
    }
    boolean isEmpty (){
        return length == 0 ;
    }
    boolean isFull(){
        return length==capacity;
    }
    void insert(int x ){
        
    }
}

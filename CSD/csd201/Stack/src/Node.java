
public class Node {
    
    Object info;
    Node next; //thanh phan tro toi phan tu khac
    
    Node prev; //dung cho doubly linked list
    
    Node(){};
    
    Node (Object x, Node q, Node p){ //dung cho doubly
        info = x;
        next = p;
        prev = q;
        
    }
    
    Node(Object x, Node p) { //dung cho singularly, circularly
        info = x; 
        next = p;
    }
    
}
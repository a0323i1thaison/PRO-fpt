
public class Node {
    
    int info;
    Node next; //thanh phan tro toi phan tu khac
    
    Node prev; //dung cho doubly linked list
    
    Node(){};
    
    Node (int x, Node q, Node p){ //dung cho doubly
        info = x;
        next = p;
        prev = q;
        
    }
    
    Node(int x, Node p) { //dung cho singularly, circularly
        info = x; 
        next = p;
    }
    
}
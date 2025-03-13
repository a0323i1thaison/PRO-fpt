
public class Node {
    
    int info;
    Node next; //thanh phan tro toi phan tu khac
    
    Node(){};
    
    Node(int x, Node p) {
        info = x; 
        next = p;
    }
    
}
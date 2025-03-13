
public class CircularlyLinkedList {
    Node head, tail;
    
    public CircularlyLinkedList(){
        head = tail = null;
    };
    
    boolean isEmpty(){
        return (head == null);
    }
    
    void clear(){
        head=tail=null;
    }
    
    void addTail(int x)
    {
        if (isEmpty()){ 
            head = tail = new Node(x,null);
            tail.next = head;
        }
        else {
            Node q = new Node(x,head);
            tail.next = q;
            tail = q;
        }
    }
    
    void traverse(){ //traverse khong dung tail
        Node p = head;
        if (isEmpty()) System.err.println("List empty");
        else{  System.out.println("CIRCULARLY LINKED LIST:");
            do{
            System.out.print(p.info + " ");
            p = p.next;

        }
        while (p!=head);
        System.out.println();
        }
    }
    
    void traverseWTail(){
    }
    
    void rotateWithoutTail(){ //rotate khong dung tail
        if (isEmpty()) System.err.println("List empty");
        else head = head.next; //thay node head ban dau thanh head tiep theo (khong xoa du lieu node head ban dau)
    }
    
    void rotate(){
        if (isEmpty()) System.out.println("List empty");
        else {
        head = head.next;
        tail = tail.next;
        }
    }
    
    void removeHead(){
        if (isEmpty()) System.err.println("List empty");      
        else if (head==tail) head=tail=null;
        else {
            head = head.next; //head moi bang node ke tiep
            tail.next = head; //con tro tail moi bang head moi
        }
    }
}
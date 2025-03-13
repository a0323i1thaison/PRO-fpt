
import java.util.EmptyStackException;


public class LinkedStack { //use linkedlist to implement stack
    protected Node head; //use head to pop easier
    protected int size = 0;

    public LinkedStack() 
      { head = null; }

    public boolean isEmpty()
      { return(head==null);}

    public void push(Object x){
        head = new Node(x,head);
        size++;
      }
    
     Object top() throws EmptyStackException
      { if(isEmpty()) throw new EmptyStackException();
        return(head.info);
      }

    public Object pop() throws EmptyStackException
      { if(isEmpty()) throw new EmptyStackException();
        Object x = head.info; //return the popped head
        head=head.next; //change new head
        size--;
        return x;
      }
    
    public void traverse(){
        Node p = head;
        System.out.println("The stack:");
        System.out.println("Last<---------First");
        while (p!=null) {System.out.print(p.info + "  ");
        p = p.next;
        }
        System.out.println();
    }
    
    public int size(){
        return size;
    }
}

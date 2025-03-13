
public class ListQueue {

    //pros: easier to grow; cons: harder to read data + higher storage
    
    protected Node head, tail;

    public ListQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return (head.info);
    }

    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Object x = head.info;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return (x);
    }

    void enqueue(Object x) {
        if (isEmpty()) { //create new node
            head = tail = new Node(x);
        } else { //addtail
            tail.next = new Node(x);
            tail = tail.next;
        }
    }

}

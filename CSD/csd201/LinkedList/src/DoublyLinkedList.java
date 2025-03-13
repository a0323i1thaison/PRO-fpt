public class DoublyLinkedList {
    Node head, tail;
    
    public DoublyLinkedList(){
        head=null;
        tail=null;
    }
    
    boolean isEmpty(){return head==null;}
    
    void clear(){head=null; tail=null;}
    
    void addLast(int i){
        if (isEmpty()){
            head = tail = new Node(i, null, null); //neu rong, tao ra node moi
        }
        else {
            Node q = new Node(i, tail ,null); //tao node moi
            tail.next = q; //next tro toi node moi
            tail = q; //SET tail moi la node moi
        }
    }
    
    void addFirst(int i){
     if (isEmpty()){
            head = tail = new Node(i, null, null); //neu rong, tao ra node moi
        }
     else {
         Node q = new Node(i,null,head); //tao node moi 
         head.prev = q; //prev tro toi node moi
         head = q; //SET head moi la node moi
     }
    }
    
    void removeFirst(){
        if (isEmpty()){System.err.println("LIST EMPTY");}
        else {
        Node q = head;
        head = q.next;
        head.prev = null;
        }
    }
    
    void removeLast(){
        if (isEmpty()){System.err.println("LIST EMPTY");}
        else {
        Node q = tail;
        tail = q.prev;
        tail.next = null;
        }
    }
    
    void traverseForward(){
        Node p = head;
        while (p!=null){
            System.out.print("  "+ p.info);
            p=p.next;
        }
        System.out.println();
    }
    
    void traverseBackward(){
        Node p = tail;
        while(p!=null){
            System.out.print("  "+p.info);
            p=p.prev;
        }
        System.out.println();
    }
    
    void removeData(int x){
        if (isEmpty()){System.err.println("LIST EMPTY");} //list trong
        else if (head==tail) 
            {if (head.info==x) head=tail=null;} //chi co 1 phan tu
        else {
        Node p = head;
        while (p!=null){
                if (head.info==x){ //truong hop head
                    head = head.next;
                    head.prev = null;
                    }
                else
                if (tail.info==x){ //truong hop tail
                    tail = tail.prev;
                    tail.next = null;
                    }
                else
                if (p.info == x){ //truong hop o giua
                    p.prev.next=p.next;
                    p.next.prev=p.prev;
                }    
            p = p.next; //dich p
            }
        }
    }
    
    void sort(){
        if (isEmpty()) {System.err.println("LIST EMPTY");} //list trong
        else if (head==tail){System.err.println("List chi co 1 phan tu");}
        else{
            for (Node i = head; i!=null; i = i.next) {   
                for (Node j = head; j.next!=null; j=j.next){
                if (j.info>j.next.info){
                    int temp;
                    temp = j.next.info;
                    j.next.info = j.info;
                    j.info = temp;
                }   
                }
            }
        }
    }
}
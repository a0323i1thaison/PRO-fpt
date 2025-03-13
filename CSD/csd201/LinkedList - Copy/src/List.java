
public class List {
    Node head, tail;
    
    public List(){
        head = tail = null;
    }
    
    boolean isEmpty(){
        return (head == null); 
    }
    
    void clear(){
        head = tail = null;
    }
    
    void addAtEnd(int x){
        if (isEmpty())
            head = tail = new Node (x,null);
        else{
                Node q = new Node(x, null);
                tail.next = q; tail = q;
        }
    
    }
    
    void addAtBegin(int x){
        if (isEmpty())
            head = tail = new Node (x,null);
        else {
                Node q = new Node(x, null); //tao node moi
                q.next = head; //node moi tro toi head
                head = q; //head bang node moi
        }
    }
    
    void traverse(){
        Node p = head;
        while (p!=null) {System.out.print(p.info + "  ");
        p = p.next;
        }
        System.out.println();
    }
    
    
    
    void insertByIndex(int x, int index){
        Node p = head; //node hien tai dc duyet
        int i = 0;
        while (p.next!=null&&i<index-1) //dieu kien
        {
            i++;
            p = p.next;
        }
        Node q = new Node (x, null);
        q.next = p.next; //tro cua node moi bang tro cua node current
        p.next = q; //tro cua node current se bang head cua node moi

    }
    
    void deleteHead(){
        if (isEmpty()) System.out.println("empty list");
        else head = head.next; //thay node head ban dau thanh head tiep theo (khong xoa du lieu node head ban dau)
    }
    
    void deleteTail(){
            if (isEmpty()) System.out.println("empty list");
            else if (head == tail) {head = tail = null;}
            else {
                Node current1 = head, current2 = head;
                while (current1.next!=null){
                    current1 = current1.next;
                    
                }
                while (current2.next!=current1){
                    current2 = current2.next;

                }
                    tail = current2;
                    tail.next = null;
            }
    }
    
    void deleteByIndex(int index){
        if (isEmpty()) System.out.println("empty list"); //empty
            else if (head == tail) {head = tail = null;} //khi chi co 1 node
            else if (index < 0){deleteHead();} //index am
            else 
            {
                Node current = head;
                int i=0;
                while (current.next!=null&&i<index - 1){
                    current = current.next;
                    i++;
                 }
                if  (current.next==null){deleteTail();}
                else current.next = current.next.next;
            }
        }
    
    
    
    void deleteData(int data){ //xoa dua vao data
        if (isEmpty()) System.out.println("empty list"); //empty
        else {
            Node current = head;
            while (current.next!=null) {
                if (head.info==data) {
//                    current = head.next;
                    head = head.next;
                }
                 
                
                    if (current.next.info == data) {
                        if (current.next.next ==null){
                        current.next = null; //
                        tail = current;  //
                        }                   
                    else current.next=current.next.next;
                    }
                    else current = current.next;
            }
        }
    }
}

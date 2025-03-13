public class ArrayQueue {
    
    //Using circular queue
    //pros: easier to read, preferable if already know the no of elements
    
    protected Object[] a; //array initialization
    protected int max; //capacity
    protected int first, last; //first, last element
    protected int size = 0; //size
    
    public ArrayQueue(){
        this(10);
    }
    
    public ArrayQueue(int max1){
        max=max1;
        a = new Object[max];
        first=last=-1;
    }
    
    public boolean isEmpty(){
        return first==-1;
    }
    
    public boolean isFull(){
        return first == 0 && last == max - 1 ;
    }
    
    private boolean grow() {
        int i, j;
        int max1 = max + max / 2;
        Object[] a1 = new Object[max1];
        if (a1 == null) {
            return (false);
        }
        if (last >= first) {
            for (i = first; i <= last; i++) {
                a1[i - first] = a[i];
            }
        } else {
            for (i = first; i < max; i++) {
                a1[i - first] = a[i];
            }
            i = max - first;
            for (j = 0; j <= last; j++) {
                a1[i + j] = a[j];
            }
        }
        a = a1;
        first = 0;
        last = max - 1;
        max = max1;
        return (true);
    }

    void enqueue(Object x) {
        if (isFull() && !grow()) { //isFull
            return;
        }
        if (last == max - 1 || last == -1) { //last is the bound element, but first blocks are empty due to earlier dequeuing
            a[0] = x;
            last = 0;
            if (first == -1) { //isEmpty
                first = 0;
            }
        } else { //general case
            a[++last] = x;
        }
        size++;
    }
    
    Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return (a[first]);
    }
    
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Object x = a[first];
        if (first == last) // only one element
        {
            first = last = -1;
        } else if (first == max - 1) { //bound case
            first = 0;
        } else { //general case
            first++;
        }
        size--;
        return (x);
    }
    
    public int size(){
        return size;
    }
    
    public int size2(){
        if (last>first) return last-first+1;
        else return (max-first+last);
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue empty");
        } else if (first<last){
            for (int i = first; i <= last; i++) System.out.print(a[i] + " "); //truong hop binh thuong            
        }
        else { //truong hop bi lat nguoc
            for (int i = first; i<=max-1; i++) System.out.print(a[i] + " "); //duyet tu first den max
            for (int i = 0; i<=last; i++) System.out.print(a[i] + " "); //duyet tu 0 den last
        }
        System.out.println("size: " + size2());
    }
}

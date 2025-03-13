public class Test {
    public static void main(String[] args) throws Exception{
        
        ArrayQueue q = new ArrayQueue();
        
        q.enqueue(10);
        q.enqueue(18);
        q.enqueue(38);
        q.enqueue(28);
        q.enqueue(11);
        q.traverse();
        Object temp = q.dequeue();
        System.out.println("dequeuing: "+temp);
        q.traverse();
        q.enqueue(20);
        q.enqueue(40);
        q.traverse();
        temp = q.dequeue();
        System.out.println("dequeuing: "+temp);
        q.traverse();

    }
}
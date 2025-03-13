


public class TestHeap {

    public TestHeap() {
    }
    
    public static void main(String [] args){
        Heap h = new Heap();
        h.insert(20);
        h.insert(10);
        h.insert(15);
        h.insert(8);
        h.insert(7);
        h.insert(13);
        h.insert(14);
        h.insert(2);
        h.insert(5);
        h.insert(6);
        h.preOrder(0);
        
        //insert new unordered element
        h.insert(14);
        System.out.println();
        int i = h.dequeue();
        System.out.println("Dequeue: "+ i);//rearrange new element
        h.preOrder(0);
    }

}
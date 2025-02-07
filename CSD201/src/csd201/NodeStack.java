package csd201;

public class NodeQueue {

    private void increaseCap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class Node {

        int data;

        public Node(int x) {
            this.data = x;
        }
    }
    int capacity, fistIdx, lastIdx;
    Node[] arrayNode;

    public NodeQueue(int cap) {
        this.capacity = cap;
        this.fistIdx = this.lastIdx = -1;
        this.arrayNode = new Node[cap];
    }

    public NodeQueue() {
        this(5);
    }

    boolean isEmpty() {
        return lastIdx == -1;
    }

    boolean isFull() {
        return (fistIdx == lastIdx + 1);
    }

    void enqueue(int x) {
       
    
    }
        
    
}
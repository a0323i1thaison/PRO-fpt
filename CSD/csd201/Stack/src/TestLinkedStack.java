public class TestLinkedStack {
    public static void main (String args[]){
        LinkedStack lStack = new LinkedStack();
        lStack.push(10);
        lStack.push(12);
        lStack.push(15);
        lStack.push(30);
        lStack.push(40);
        lStack.traverse();
        System.out.println("pop: "+lStack.top());
        lStack.pop();
        System.out.println("top: "+lStack.top());
        System.out.println("size: "+lStack.size);
        
    }    
}
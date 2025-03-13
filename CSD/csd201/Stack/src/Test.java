

public class Test {
    public static void main(String args[]){
        Stack stack = new Stack(10);
        stack.push(3);
        stack.push(6);
        stack.push(11);
        stack.push(4);
        stack.push(5);
        stack.traverse();
        System.out.println("POP: " + stack.pop());
        stack.traverse();
        System.out.println("PUSH: 30");
        stack.push(30);
        stack.traverse();
        System.out.println("PUSH: 50");
        stack.push(50);
        stack.traverse();
        System.out.println("TOP: "+stack.top());
        System.out.println("MAX: "+stack.max);
        stack.push(75);
        System.out.println("MAX: "+stack.max);
        System.out.println("SIZE: "+stack.size());
        
        
    }
}

package assignment1;
  


// Stack implementation using array
public class PlanetStack {
     private Planet[] stack;
    private int top;
    private int capacity;

    public PlanetStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Planet[capacity];
        this.top = -1;
    }

    // Push: Insert planet into the stack (sorted by mass)
    public void push(Planet planet) {
        if (top == capacity - 1) {
            System.out.println("Stack is full! Cannot push more planets.");
            return;
        }
        int i = top;
        while (i >= 0 && stack[i].mass > planet.mass) {
            stack[i + 1] = stack[i];
            i--;
        }
        stack[i + 1] = planet;
        top++;
    }

    // Pop: Remove the top element
    public Planet pop() {
        if (top == -1) {
            System.out.println("Stack is empty! No planets to pop.");
            return null;
        }
        return stack[top--];
    }

    // Peek: Get the top element without removing it
    public Planet peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Print stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack contents (Mass-Ordered):");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }
    
}

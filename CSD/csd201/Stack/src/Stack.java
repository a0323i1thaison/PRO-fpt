
import java.util.EmptyStackException;

public class Stack {
    protected Object [] a;
    protected int top,max;
    
    public Stack(int max1){ //constructor
        max = max1; //max capacity
        a = new Object[max]; //create a new array as stack
        top = -1; //top-most object
    }
    
    public boolean isEmpty(){ //check if stack is empty
        return (top==-1);
    }
    
    protected boolean grow(){ //increase the stack size
    
        int max1 = max+max/2;
                
        Object[] a1 = new Object[max1]; //create new stack
        
        if (a1==null) return false;
        for (int i = 0; i<=top; i++) a1[i] = a[i];
        a = a1;
        return true;
    }
    
    public boolean isFull(){ 
        return (top==max-1);
    }
    
    public void clear(){ //set the top to -1
        top = -1;
    }
    
    public void push(Object x){ //push new object
        if (isFull()&&!grow()) return; //check if full
        a[++top] = x;
    }
    
    Object top() throws EmptyStackException{
        if (isEmpty()) throw new EmptyStackException();
        return a[top];
    }
    
    public Object pop() throws EmptyStackException{
        if (isEmpty()) throw new EmptyStackException();
        Object x = a[top]; //get top object
        top--; //subtract index
        return x;
    }
    
    public void traverse(){
        System.out.println("Print the stack:\n");
        for (int i = top; i>=0; i--){
            System.out.println(a[i]);
        }
        System.out.println();
    }
    
    public int size(){
        return top+1;
    }
}
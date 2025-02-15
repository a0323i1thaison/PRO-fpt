/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab211son.Week3.SS4;

/**
 *
 * @author thais
 */
public class Test {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.displayStack();

        System.out.println("Top element: " + stack.get());
        System.out.println("Popped element: " + stack.pop());

        stack.displayStack();
    }
}

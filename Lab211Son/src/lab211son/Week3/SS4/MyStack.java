/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab211son.Week3.SS4;

import java.util.ArrayList;

/**
 *
 * @author thais
 */
public class MyStack<T> {

    private ArrayList<T> stackValues;

    public MyStack() {
        stackValues = new ArrayList<>();
    }

    public void push(T value) {
        stackValues.add(value);
        System.out.println(value + " pushed to stack");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        return stackValues.remove(stackValues.size() - 1);
    }

    public T get() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot get top value.");
            return null;
        }
        return stackValues.get(stackValues.size() - 1);
    }

    public boolean isEmpty() {
        return stackValues.isEmpty();
    }

    public void displayStack() {
        System.out.println("Stack contents: " + stackValues);
    }

}

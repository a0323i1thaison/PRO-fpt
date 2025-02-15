/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thais
 */
public class LinkedListDeque {

    class Node {

        int data;
        Node prev, next;

        public Node(int x, Node prev, Node next) {
            this.data = x;
            this.prev = prev;
            this.next = next;
        }

        public Node(int x) {
            this(x, null, null);
        }
        Node head, tail;
        /*
        Duoble-end queue is a queue where add, remoove, read. can operate at its two ends
        addFirst, addLast, removeFirst, removeLast,front, last
         */
    }
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        return data;
    }

    public int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        return data;
    }

    Node front() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        } else {
            return head;
        }

    }

    Node last() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        } else {
            return tail;
        }
    }

    void traverse() {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
            current = tail;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }
}

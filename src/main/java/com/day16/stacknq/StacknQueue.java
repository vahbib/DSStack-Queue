package com.day16.stacknq;

import static java.lang.System.exit;

public class StacknQueue {
    private class Node {

        int data; // integer data
        Node link; // reference variable Node type
    }
    Node top;
    StacknQueue()
    {
        this.top = null;
    }

    // UserCase 1
    // insert at the beginning
    public void push(int x)
    {

        Node temp = new Node();

        if (temp == null) {
            System.out.println("Heap Overflow");
            return;
        }

        temp.data = x;

        temp.link = top;

        top = temp;
    }
    public void display()
    {
        if (top == null) {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("%d-->", temp.data);

                temp = temp.link;
            }
        }
    }
    public boolean isEmpty()
    {
        return top == null;
    }
    // UserCase 2: Peek & Pop
    public int peek()
    {
        // check for non empty stack
        if (!isEmpty())
        {
//            System.out.println(top.data);
            return top.data;
        }
        else
        {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop() {
        while (top != null) {
            top = (top).link;
        }
    }

    public static void main(String[] args) {
        
        StacknQueue obj = new StacknQueue();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek()); //UC2

        obj.pop(); // UC 2
        obj.display();

    }
}

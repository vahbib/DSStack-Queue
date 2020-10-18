package com.day16.stacknq;


import static java.lang.System.exit;

public class StacknQueue {
    static class QNode {
        int key;
        QNode next;

        public QNode(int key)
        {
            this.key = key;
            this.next = null;
        }
    }

    static class Queue {
        QNode front, rear;

        public Queue()
        {
            this.front = this.rear = null;
        }

        // UC 3 - Method to add an key to the queue
        void enqueue(int key)
        {
            QNode temp = new QNode(key);

            // If queue is empty, then new node is front and rear both
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }

            // Add the new node at the end of queue and change rear
            this.rear.next = temp;
            this.rear = temp;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        //System.out.println("Queue is: "+q);
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);

    }
}

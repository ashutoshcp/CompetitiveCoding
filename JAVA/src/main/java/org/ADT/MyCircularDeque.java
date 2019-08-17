package org.ADT;

public class MyCircularDeque {

    private class Node {
        int data;
        Node next;
        Node prev;
        public Node(int k) {
            this.data = k;
            next= null;
            prev = null;
        }
    }
    private int maxSize;
    private int currSize;
    private Node front;
    private Node rear;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        maxSize = k;
        currSize = 0;
        front = null;
        rear = null;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }
        Node temp = new Node(value);
        if(front == null) {
            rear = front = temp;
        } else {
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        currSize++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }
        Node temp = new Node(value);
        if(rear == null) {
            rear = front = temp;
        } else {
            temp.prev = rear;
            rear.next = temp;
            rear = temp;
        }
        currSize++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        Node temp = front;
        front = front.next;
        if(front ==null) {
            rear = null;
        } else {
            front.prev = null;
        }
        temp = null;
        currSize--;
        return true;

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        Node temp = rear;
        rear = rear.prev;
        if(rear == null) {
            front = null;
        } else {
            rear.next =null;
        }
        temp = null;
        currSize--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return front.data;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return rear.data;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return front == null;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(currSize == maxSize) {
            return true;
        }
        return false;
    }
}

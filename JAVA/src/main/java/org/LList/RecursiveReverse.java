package org.LList;

public class RecursiveReverse {
    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    private void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public static void main(String[] args) {
        RecursiveReverse reverse = new RecursiveReverse();
        reverse.process();
    }

    private Node recursive(Node node) {
        Node temp;
        if (node.next == null) {
            return node;
        }
        temp = recursive(node.next);
        node.next.next = node;
        node.next = null;
        return temp;
    }

    private Node reverseIteratively(Node head) {
        Node current = head;
        Node previous = null;
        // traversing linked list until there is no more element
        while (current != null) {
            // Saving reference of next node, since we are changing current node
            Node temp = current.next;
            // Inserting node at start of new list
            current.next = previous;
            previous = current;
            // Advancing to next node
            current = temp;
        }
        return previous;
    }


    private void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    private void process() {
        append(1);
        append(2);
        append(3);
        append(4);
        print();
        head = reverseIteratively(head);
        print();
        head = reverseIteratively(head);
        print();
        head = recursive(head);
        print();
        head = recursive(head);
        print();
    }
}

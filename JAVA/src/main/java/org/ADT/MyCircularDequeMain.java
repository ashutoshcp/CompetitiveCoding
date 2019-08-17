package org.ADT;

public class MyCircularDequeMain {
    public static void main(String[] args) {
        // Your MyCircularDeque object will be instantiated and called as such:
          MyCircularDeque obj = new MyCircularDeque(2);
          boolean param_1 = obj.insertFront(5);
          boolean param_2 = obj.insertLast(7);
          boolean param_3 = obj.deleteFront();
          boolean param_4 = obj.deleteLast();
          int param_5 = obj.getFront();
          int param_6 = obj.getRear();
          boolean param_7 = obj.isEmpty();
          boolean param_8 = obj.isFull();
    }
}

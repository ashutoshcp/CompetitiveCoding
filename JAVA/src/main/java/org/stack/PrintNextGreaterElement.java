package org.stack;

import java.util.Stack;

public class PrintNextGreaterElement {
    private PrintNextGreaterElement() {
    }

    public static void main(String[] args) {
        PrintNextGreaterElement printNextGreaterElement = new PrintNextGreaterElement();
        printNextGreaterElement.process();
    }

    private void process() {
        int[] arr = {11, 13, 21, 3};
        printNGE(arr);
    }

    private void printNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            if (stack.empty()) {
                stack.push(value);
                continue;
            }

            while (!stack.empty() && stack.peek() < value) {
                System.out.println(stack.peek() + " --> " + value);
                stack.pop();
            }
            stack.push(value);
        }
        while (!stack.empty()) {
            System.out.println(stack.peek() + " --> " + (-1));
            stack.pop();
        }
    }
}

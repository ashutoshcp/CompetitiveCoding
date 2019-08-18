package org.ADT;

import java.util.LinkedList;
import java.util.List;

public class StackImpl {
    public static void main(String[] args) {
        StackImpl im = new StackImpl();
        im.process("abbcaaaccbcccbbaaabaa", 3);
    }

    private void process(String input, int bL) {
        List<Character> stack = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            stack.add(current);
            if (stack.size() > 2 && !current.equals(stack.get(stack.size() - 2))) {
                int count = 1;
                int index = stack.size() - 2;
                while (index > 0 && (stack.get(index) == stack.get(index - 1))) {
                    index--;
                    count++;
                }
                if (count >= bL) {
                    while (count-- > 0) {
                        stack.remove(stack.size() - 2);
                    }
                }
            }
        }
        if (stack.size() > 2 && stack.get(stack.size() - 1).equals(stack.get(stack.size() - 2))) {
            int count = 1;
            int index = stack.size() - 1;
            while (index > 0 && (stack.get(index) == stack.get(index - 1))) {
                index--;
                count++;
            }
            if (count >= bL) {
                while (count-- > 0) {
                    stack.remove(stack.size() - 1);
                }
            }
        }
        System.out.println(stack.toString());
    }
}

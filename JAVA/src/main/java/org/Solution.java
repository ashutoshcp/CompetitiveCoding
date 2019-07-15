package org;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static String minLexicographicallyPath(String line) {
        StringBuilder output = new StringBuilder();
        char[] array = line.toCharArray();
        int direction = 1; // can be from 1 to 4 (clockwise)
        int[] xy = {0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'L') {
                direction = ((direction + 2) % 4)+1;
            } else if (array[i] == 'R') {
                direction = (direction % 4)+1;
            } else {
                switch (direction) {
                    case 1:
                        xy[1] += 1;
                        break;
                    case 2:
                        xy[0] += 1;
                        break;
                    case 3:
                        xy[1] -= 1;
                        break;
                    case 4:
                        xy[0] -= 1;
                }
            }
        }

        int x = xy[0];
        int y = xy[1];
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        int min = Math.min(absX, absY);
        int outDirection;
        if (x > 0 && y > 0) {
            outDirection = 1;
        } else if (x > 0 && y < 0) {
            outDirection = 2;
        } else if (x < 0 && y < 0) {
            outDirection = 3;
        } else {
            outDirection = 4;
        }
        for (int i = 0; i < min; i++) {
            output.append(outDirection);
        }


        int diff = Math.abs(absX - absY);
        char[] a = new char[diff];
        if (absX > absY) {
            if (x < 0) {
                Arrays.fill(a,'8');
            } else {
                Arrays.fill(a,'6');
            }
        } else {
            if (y < 0) {
                Arrays.fill(a,'7');
            } else {
                Arrays.fill(a,'5');
            }
        }
        output.append(a);
        output.append("0");
        return output.toString();
    }


    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        for (int i = 0; i < testcases; i++) {
            s.nextInt();
            String instructions = s.next();
            System.out.println(minLexicographicallyPath(instructions));
        }
    }
}

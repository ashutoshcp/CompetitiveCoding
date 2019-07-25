package org.tracxn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tracxn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int fat = 0, fiber = 0, carb = 0;
        int[] arr = new int[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            arr[i] = 0;
        }
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < numberOfDays; i++) {
            String ingredientId = in.next();
            if (ingredientId.startsWith("FAT")) {
                fat++;
                if (!q.contains("FAT")) {
                    q.add("FAT");
                }
            } else if (ingredientId.startsWith("CARB")) {
                carb++;
                if (!q.contains("CARB")) {
                    q.add("CARB");
                }
            } else if (ingredientId.startsWith("FIBER")) {
                fiber++;
                if (!q.contains("FIBER")) {
                    q.add("FIBER");
                }
            }
            if (fat == 3) {
                arr[i] = 1;
                q.remove("FAT");
                fat = 0;
            }
            if (fiber == 3) {
                arr[i] = 1;
                q.remove("FIBER");
                fiber = 0;
            }
            if (carb == 3) {
                arr[i] = 1;
                q.remove("CARB");
                carb = 0;
            }
            int x1 = fat + carb, x2 = fat + fiber, x3 = carb + fiber;
            if (x1 == 3 || x2 == 3 || x3 == 3) {
                arr[i] = 1;
                if (fat == 2) {
                    q.remove("FAT");
                    fat = 0;
                }
                if (carb == 2) {
                    q.remove("CARB");
                    carb = 0;
                }
                if (fiber == 2) {
                    q.remove("FIBER");
                    fiber = 0;
                }
                String popped = q.poll();
                q.remove(popped);
                if (popped.equals("FAT")) {
                    fat = 0;
                }
                if (popped.equals("FIBER")) {
                    fiber = 0;
                }
                if (popped.equals("CARB")) {
                    carb = 0;
                }
            }

        }

        for (int i = 0; i < numberOfDays; i++) {
            System.out.print(arr[i]);
        }

    }

}

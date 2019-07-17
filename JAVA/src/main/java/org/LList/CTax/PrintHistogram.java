package org.LList.CTax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Clock;
import java.time.ZoneId;

public class PrintHistogram {

    public static void main(String[] args) throws IOException {
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        File file = new File("/Users/ashutoshgupta/PycharmProjects/ML/JAVA/src/main/java/org/LList/CTax/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        Clock clock;
        while ((line = bufferedReader.readLine()) != null) {
            clock = Clock.system(zoneId);
            System.out.println(clock.instant());
            String[] split = line.trim().split(" ");
            int N = split.length;
            int[] arr = new int[N];
            int i = 0;
            for (String s : split) {
                arr[i++] = Integer.parseInt(s);
                if ((arr[i-1] < -9 || arr[i-1] > 99) ){
                    System.out.println(arr[i-1]);
                    throw new RuntimeException("Valid number range is [-9, 99], you have invalidNumber: " + s);
                }
            }
            printHist(arr, N);
            clock = Clock.system(zoneId);
            System.out.println(clock.instant());
        }
    }

    private static void printHist(int[] arr, int n) {
        int maxElement = arr[0];
        int minElement = arr[0];
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(arr[i], maxElement);
            minElement = Math.min(arr[i], minElement);
        }
        for (int i = maxElement; i > 0; i--) {
            String num = String.valueOf(i);
            if (num.length() == 1) {
                num = " " + num;
            }
            num = " " + num;
            System.out.print(num + " | ");
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print(" x ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= n + 1; i++) {
            System.out.print("---");
        }
        System.out.println();
        System.out.print("  0 | ");
        for (int i = 0; i < n; i++) {
            String num = String.valueOf(arr[i]);
            if (num.length() == 1) {
                num = " " + num;
            }
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i <= n + 1; i++) {
            System.out.print("---");
        }
        System.out.println();
        for (int i = 1; i <= Math.abs(minElement); i++) {
            String num = String.valueOf(i);
            num = "-" + num;
            if (num.length() == 2) {
                num = " " + num;
            }
            System.out.print(num + " | ");
            for (int j = 0; j < n; j++) {
                if (arr[j] < 0) {
                    if (Math.abs(arr[j]) >= i) {
                        System.out.print(" x ");
                    } else {
                        System.out.print("   ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

package org.LList.CTax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintHistogramBucket {
    private final String inputFileLocation =
            "/Users/ashutoshgupta/Downloads/clearTax/src/main/java/org/clearTax/interview/input.txt";

    public static void main(String[] args) throws IOException {
        PrintHistogramBucket printHistogram = new PrintHistogramBucket();
        printHistogram.process();
    }

    private void process() throws IOException {
        File file = new File(inputFileLocation);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line1 = bufferedReader.readLine();
        String line2 = bufferedReader.readLine();
        int bucketSize = Integer.parseInt(line2); //factor;
        assert bucketSize >= 1;
        String[] numbers = line1.split(",");
        int numbersSize = numbers.length;
        int[] arr = new int[numbersSize];
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < numbersSize; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            assert arr[i] >= 1;
            maxEle = Math.max(maxEle, arr[i]);
        }
        int countOfIntervalsPositive = (int) Math.ceil(((double) maxEle) / bucketSize);
        //System.out.println(countOfIntervalsPositive);
        int[] histogram = new int[countOfIntervalsPositive];
        for (int i = 0; i < numbersSize; i++) {
            int num1 = arr[i] / bucketSize;
            if (arr[i] % bucketSize == 0) {
                num1--;
            }
            histogram[num1]++;
        }
        /*for (int i=0; i< countOfIntervalsPositive; i++) {
            System.out.println(histogram[i]);
        }*/
        System.out.println();
        System.out.println("Numbers on Horizontal Axis are on scale: " + "[(i*bucketSize+1)- (i+1)*bucketSize)] in one interval");
        System.out.println("Numbers on Vertical Axis are count of numbers in those intervals...");
        System.out.println();
        System.out.println();
        System.out.println("Horizontal Axis distributions are: ");
        for (int i = 0; i < countOfIntervalsPositive; i++) {
            System.out.println(i + " represents:  [" + (i * bucketSize + 1) + "-" + ((i + 1) * bucketSize) + "]");
        }
        System.out.println();
        System.out.println();
        printHistogram(histogram, countOfIntervalsPositive);
    }

    private void printHistogram(int[] histArray, int histArraySize) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < histArraySize; i++) {
            maxElement = Math.max(histArray[i], maxElement);
        }
        for (int i = maxElement; i > 0; i--) {
            String num = String.valueOf(i);
            if (num.length() == 1) {
                num = " " + num;
            }
            num = " " + num;
            System.out.print(num + " | ");
            for (int j = 0; j < histArraySize; j++) {
                if (histArray[j] >= i) {
                    System.out.print(" x ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= histArraySize + 1; i++) {
            System.out.print("---");
        }
        System.out.println();
        System.out.print("    | ");
        for (int i = 0; i < histArraySize; i++) {
            String num = String.valueOf(i);
            if (num.length() == 1) {
                num = " " + num;
            }
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

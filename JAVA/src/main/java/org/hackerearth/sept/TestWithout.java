package org.hackerearth.sept;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestWithout {
    private final BufferedReader bufferedReader;

    private TestWithout() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        TestWithout chefdil = new TestWithout();
        chefdil.process();
    }

    private void process() throws IOException {
        int Q = Integer.parseInt(bufferedReader.readLine());
        while (Q-- > 0) {
            String s = bufferedReader.readLine();
            String[] sp = s.split(" ");
            Long L = Long.parseLong(sp[0]);
            Long countLast = Long.parseLong(sp[1]);
            System.out.println((L-1) + countLast);
        }
        bufferedReader.close();
    }
}

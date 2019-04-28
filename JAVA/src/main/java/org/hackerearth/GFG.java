package org.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GFG {

    private static int R, C;

    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String first = bufferedReader.readLine();
        String[] split = first.split(" ");
        R = Integer.parseInt(split[0]);
        C = Integer.parseInt(split[1]);
        char[][] input2DArray = new char[R][C];
        List<Pair<Integer, Integer>> allSIndexes = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            String next = bufferedReader.readLine();
            for (int j = 0; j < C; j++) {
                char c = next.charAt(j);
                input2DArray[i][j] = c;
                if (c == 's') {
                    Pair<Integer, Integer> pair = new Pair<>(i, j);
                    allSIndexes.add(pair);
                }
            }
        }

        for (Pair<Integer, Integer> p : allSIndexes) {
            int xi = p.getV1();
            int yi = p.getV2();
            //System.out.println(xi + " " + yi);

            try {
                if (input2DArray[xi + 1][yi] == 'a' && input2DArray[xi + 2][yi] == 'b' && input2DArray[xi + 3][yi] == 'a') {
                    count++;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                //no-op
            }

            try {
                if (input2DArray[xi][yi + 1] == 'a' && input2DArray[xi][yi + 2] == 'b' && input2DArray[xi][yi + 3] == 'a') {
                    count++;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                //no-op
            }


            try {
                if (input2DArray[xi - 1][yi + 1] == 'a' && input2DArray[xi - 2][yi + 2] == 'b' && input2DArray[xi - 3][yi + 3] == 'a') {
                    count++;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                //no-op
            }

            try {
                if (input2DArray[xi + 1][yi + 1] == 'a' && input2DArray[xi + 2][yi + 2] == 'b' && input2DArray[xi + 3][yi + 3] == 'a') {
                    count++;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                //no-op
            }


            //System.out.println(count);
        }

        System.out.println(count);
    }

    private static class Pair<T, S> {
        private T v1;
        private S v2;

        public Pair(T v1, S v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        public T getV1() {
            return v1;
        }

        public void setV1(T v1) {
            this.v1 = v1;
        }

        public S getV2() {
            return v2;
        }

        public void setV2(S v2) {
            this.v2 = v2;
        }
    }
}


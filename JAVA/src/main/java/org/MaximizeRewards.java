package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximizeRewards {
    private class Job implements Comparable<Job> {
        private int D;
        private int R;
        private int P;

        public Job() {
        }

        public int getD() {
            return D;
        }

        public void setD(int d) {
            D = d;
        }

        public int getR() {
            return R;
        }

        public void setR(int r) {
            R = r;
        }

        public int getP() {
            return P;
        }

        public void setP(int p) {
            P = p;
        }

        @Override
        public int compareTo(Job o) {
            /*if (o.R == this.R) {
                return o.D - this.D;
            }*/
            //return this.R - o.R;
            return   this.D - o.D;
        }

        @Override
        public String toString() {
            return "Job{" +
                    "D=" + D +
                    ", R=" + R +
                    ", P=" + P +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        MaximizeRewards maximizeRewards = new MaximizeRewards();
        maximizeRewards.process();
    }

    private void process() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(bufferedReader.readLine());
            List<Job> jobs = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String line = bufferedReader.readLine();
                String[] split = line.split(" ");
                Job job = new Job();
                job.D = Integer.parseInt(split[0]);
                job.R = Integer.parseInt(split[1]);
                job.P = Integer.parseInt(split[2]);
                jobs.add(job);
            }
            Collections.sort(jobs);
            int maxDead = jobs.get(jobs.size() - 1).D;
            /*int[][] A = new int[N][maxDead];
            for (int i = 0; i < N; i++) {
                for (int t = 0; t < maxDead; t++) {
                    if (i == 0) {
                        A[i][t] = 0;
                    } else {
                        Job job = jobs.get(i);
                        int tCom = Math.min(t, job.D) - job.P;
                        if (tCom <  0) {
                            A[i][t] = A[i-1][t];
                        } else {
                            A[i][t] = Math.max(A[i-1][t], job.R + A[i-1][tCom]);
                        }
                    }
                }
            }
            System.out.println(A[N-1][maxDead-1]);*/
            int[][] B = new int[N][maxDead];
            for (int i = 0; i < N; i++) {
                for (int t = 0; t < maxDead; t++) {
                    if (i == 0) {
                        B[i][t] = 0;
                    } else {
                        Job job = jobs.get(i);
                        int tCom = Math.min(t, job.D) - job.P;
                        if (tCom <  0) {
                            B[i][t] = B[i-1][t];
                        } else {
                            B[i][t] = Math.max(B[i-1][t], job.R + B[i-1][tCom]);
                        }
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int t = 0; t < maxDead; t++) {
                    System.out.print(B[i][t] + " ");
                }
                System.out.println();
            }
            System.out.println(B[N-1][maxDead-1]);
            System.out.println(jobs.toString());
        }
    }
}

/**
 * 1
 * 6
 * 1 2 1
 * 2 3 1
 * 4 1 2
 * 10 10 10
 * 15 13 10
 * 15 7 5
 * D R P
 */

// 20

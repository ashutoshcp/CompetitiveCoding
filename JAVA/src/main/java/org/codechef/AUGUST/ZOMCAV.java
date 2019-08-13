package org.codechef.AUGUST;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMCAV {
    private final Reader reader;

    private ZOMCAV() {
        reader = new Reader();
    }

    public static void main(String[] args) throws IOException {
        ZOMCAV chefdil = new ZOMCAV();
        chefdil.process();
    }

    private class Query {
        int s;
        int e;

        public Query(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    private void process() throws IOException {
        int t = reader.nextInt();
        while (t-- > 0) {
            int n = reader.nextInt();
            Long[] C = new Long[n + 1];
            Long[] H = new Long[n + 1];
            Long[] R = new Long[n + 1];
            for (int i = 0; i <= n; i++) {
                R[i] = 0L;
            }
            /*String cLine = reader.readLine();
            String hLine = reader.readLine();
            String[] cSplit = cLine.split(" ");
            String[] hSplit = hLine.split(" ");
            assert cSplit.length == n;
            assert hSplit.length == n;*/
            H[0] = Long.MIN_VALUE;
            R[0] = Long.MIN_VALUE;
            C[0] = Long.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                C[i] = reader.nextLong();
            }
            for (int i = 1; i <= n; i++) {
                H[i] = reader.nextLong();
            }
            List<Query> queries = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                long l = i - C[i];
                long r = i + C[i];
                l = (l < 1) ? 1 : l;
                r = (r > n) ? n : r;
                Query query = new Query((int) l, (int) r);
                queries.add(query);
                /*for (long j = l; j <= r; j++) {
                    R[(int) j]++;
                }*/
            }
            incrementByOne(R, queries, n);
            Arrays.sort(H);
            Arrays.sort(R);
            /*System.out.println();
            for (int i = 1; i <= n; i++) {
                System.out.print(R[i] + " ");
            }
            System.out.println();*/
            boolean tt = true;
            for (int i = 1; i <= n; i++) {
                if (!H[i].equals(R[i])) {
                    tt = false;
                    break;
                }
            }
            if (tt) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        reader.close();
    }

    private void incrementByOne(Long[] r, List<Query> queries, int n) {
        Long[] sum = new Long[n + 1];
        for (int i = 0; i <= n; i++) {
            sum[i] = 0L;
        }
        for (Query q : queries) {
            sum[q.s] += 1L;
            if ((q.e + 1) < (n + 1)) {
                sum[q.e + 1] -= 1L;
            }
        }
        r[1] += sum[1];
        for (int i = 2; i <= n; i++) {
            sum[i] += sum[i - 1];
            r[i] += sum[i];
        }
    }

    private static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
}

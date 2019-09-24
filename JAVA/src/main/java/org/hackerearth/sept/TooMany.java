package org.hackerearth.sept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TooMany {
    private final BufferedReader bufferedReader;

    private TooMany() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        TooMany chefdil = new TooMany();
        chefdil.process();
    }

    private void process() throws IOException {
        String s1 = bufferedReader.readLine();
        String[] sp1 = s1.split(" ");
        Long N = Long.parseLong(sp1[0]);
        Long M = Long.parseLong(sp1[1]);
        String s = bufferedReader.readLine();
        String[] sp = s.split(" ");
        Long L = Long.parseLong(sp[0]);
        Long R = Long.parseLong(sp[1]);
        Long K = Long.parseLong(bufferedReader.readLine());
        Long l = N % M;
        List<Long> ans = new ArrayList<>();
        for (Long i = L; i<=R; i++) {
            Long x = N % i;
            if (!i.equals(M) && l.equals(x)) {
                ans.add(i);
            }
        }
        if (ans.size() > K) {
            System.out.println("-1");
        } else {
            System.out.println(ans.size());
            for (Long i: ans) {
                System.out.print(i + " ");
            }
        }

        bufferedReader.close();
    }
}
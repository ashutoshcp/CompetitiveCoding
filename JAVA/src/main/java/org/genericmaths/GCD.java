package org.genericmaths;

public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long gcd(long a, long b) {
        if (b == 0L) {
            return a;
        }
        return gcd(b, a % b);
    }
}

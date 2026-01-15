import java.util.*;

public class Lunatic { // 1826B
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            long g = 0;
            for (int i = 0; i < n / 2; i++) {
                long diff = Math.abs(a[i] - a[n - 1 - i]);
                g = gcd(g, diff);
            }

            System.out.println(g);
        }
        sc.close();
    }
}

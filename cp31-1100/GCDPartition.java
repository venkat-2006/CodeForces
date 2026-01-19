import java.util.*;

public class GCDPartition {//1780B

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

            long total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];
            }

            long ans = 0;
            long pref = 0;

            for (int i = 0; i < n - 1; i++) {
                pref += a[i];
                ans = Math.max(ans, gcd(pref, total - pref));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

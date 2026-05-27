import java.util.*;

public class AbsoluteCinema {//2229B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long sum = 0;
            long best = 0;

            for (int i = 0; i < n; i++) {
                long b = sc.nextLong();
                sum += Math.max(a[i], b);
                best = Math.max(best, Math.min(a[i], b));
            }

            System.out.println(sum + best);
        }

        sc.close();
    }
}
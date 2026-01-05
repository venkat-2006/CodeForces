import java.util.*;

public class TNT {//1899B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            
            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + a[i];
            }

            long answer = 0;

            // try all k
            for (int k = 1; k <= n; k++) {
                if (n % k != 0) continue;

                long minSum = Long.MAX_VALUE;
                long maxSum = Long.MIN_VALUE;

                for (int i = 0; i < n; i += k) {
                    long sum = pref[i + k] - pref[i];
                    minSum = Math.min(minSum, sum);
                    maxSum = Math.max(maxSum, sum);
                }

                answer = Math.max(answer, maxSum - minSum);
            }

            System.out.println(answer);
        }
        sc.close();
    }
}

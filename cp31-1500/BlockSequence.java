import java.util.*;

public class BlockSequence {//1881E
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] dp = new int[n + 1];

            dp[n] = 0;

            for (int i = n - 1; i >= 0; i--) {
               dp[i] = 1 + dp[i + 1];

                if (i + arr[i] < n) {
                    dp[i] = Math.min(dp[i], dp[i + arr[i] + 1]);
                }
            }

            System.out.println(dp[0]);
        }

        sc.close();
    }
}
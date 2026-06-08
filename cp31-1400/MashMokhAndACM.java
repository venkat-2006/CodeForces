import java.util.*;

public class MashMokhAndACM { // 414B

    static final long MOD = 1000000007L;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][] dp = new long[k + 1][n + 1];

      
        for (int x = 1; x <= n; x++) {
            dp[1][x] = 1;
        }

       
        for (int len = 2; len <= k; len++) {
           
            for (int x = 1; x <= n; x++) {

                for (int d = 1; d <= x; d++) {

                    if (x % d == 0) {

                        dp[len][x] =
                                (dp[len][x] + dp[len - 1][d]) % MOD;
                    }
                }
            }
        }

        long ans = 0;

        for (int x = 1; x <= n; x++) {
            ans = (ans + dp[k][x]) % MOD;
        }

        System.out.println(ans);

        sc.close();
    }
}
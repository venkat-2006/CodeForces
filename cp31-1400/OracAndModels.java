import java.util.*;

public class OracAndModels { // CF 1350B

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] s = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                s[i] = sc.nextInt();
            }

            int[] dp = new int[n + 1];
            Arrays.fill(dp, 1);

            int ans = 1;

            for (int i = 1; i <= n; i++) {

                for (int j = 2 * i; j <= n; j += i) {

                    if (s[i] < s[j]) {
                        dp[j] = Math.max(dp[j], dp[i] + 1);
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                ans = Math.max(ans, dp[i]);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
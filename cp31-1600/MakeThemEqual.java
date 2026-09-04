import java.util.*;

public class MakeThemEqual {//1633D
    static int[][] dp;

    static int solve(int i, int k, int[] b, int[] c, int[] cost) {
        if(i == b.length || k == 0)
            return 0;

        if(dp[i][k] != -1)
            return dp[i][k];

        int ans = solve(i + 1, k, b, c, cost);

        int need = cost[b[i]];

        if(need <= k)
            ans = Math.max(ans, c[i] + solve(i + 1, k - need, b, c, cost));

        return dp[i][k] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cost = new int[1001];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[1] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        while(!q.isEmpty()) {
            int v = q.poll();

            for(int x = 1; x <= v; x++) {
                int next = v + v / x;

                if(next <= 1000 && cost[next] > cost[v] + 1) {
                    cost[next] = cost[v] + 1;
                    q.offer(next);
                }
            }
        }

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] b = new int[n];
            int[] c = new int[n];

            for(int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            for(int i = 0; i < n; i++)
                c[i] = sc.nextInt();

            int total = 0;
            for(int x : b)
                total += cost[x];

            k = Math.min(k, total);

            dp = new int[n][k + 1];

            for(int[] row : dp)
                Arrays.fill(row, -1);

            System.out.println(solve(0, k, b, c, cost));
        }
    }
}
// import java.util.*;

// public class MakeThemEqual {//1633D

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] cost = new int[1001];
//         Arrays.fill(cost, Integer.MAX_VALUE);
//         cost[1] = 0;

//         Queue<Integer> q = new LinkedList<>();
//         q.offer(1);

//         while(!q.isEmpty()) {
//             int v = q.poll();

//             for(int x = 1; x <= v; x++) {
//                 int next = v + v / x;

//                 if(next <= 1000 && cost[next] > cost[v] + 1) {
//                     cost[next] = cost[v] + 1;
//                     q.offer(next);
//                 }
//             }
//         }

//         int t = sc.nextInt();

//         while(t-- > 0) {
//             int n = sc.nextInt();
//             int k = sc.nextInt();

//             int[] b = new int[n];
//             int[] c = new int[n];

//             for(int i = 0; i < n; i++)
//                 b[i] = sc.nextInt();

//             for(int i = 0; i < n; i++)
//                 c[i] = sc.nextInt();

//             int total = 0;

//             for(int x : b)
//                 total += cost[x];

//             k = Math.min(k, total);

//             int[][] dp = new int[n + 1][k + 1];

//             for(int i = 1; i <= n; i++) {
//                 int need = cost[b[i - 1]];
//                 int coins = c[i - 1];

//                 for(int j = 0; j <= k; j++) {
//                     dp[i][j] = dp[i - 1][j];

//                     if(need <= j) {
//                         dp[i][j] = Math.max(
//                             dp[i][j],
//                             dp[i - 1][j - need] + coins
//                         );
//                     }
//                 }
//             }

//             System.out.println(dp[n][k]);
//         }
//     }
// }

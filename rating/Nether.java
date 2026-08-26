import java.util.*;
public class Nether { // 2133C

    static ArrayList<Integer>[] graph;
    static int[] dp;
    static int[] next;

    static int dfs(int u) {
        if (dp[u] != 0) return dp[u];

        dp[u] = 1;

        for (int v : graph[u]) {
            int len = 1 + dfs(v);

            if (len > dp[u]) {
                dp[u] = len;
                next[u] = v;
            }
        }

        return dp[u];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            graph = new ArrayList[n + 1];
            dp = new int[n + 1];
            next = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();

                int k = sc.nextInt();

                for (int j = 0; j < k; j++) {
                    graph[i].add(sc.nextInt());
                }
            }

            int start = 1;

            for (int i = 1; i <= n; i++) {
                if (dfs(i) > dfs(start)) {
                    start = i;
                }
            }

            System.out.println(dp[start]);

            while (start != 0) {
                System.out.print(start + " ");
                start = next[start];
            }

            System.out.println();
        }
    }
}
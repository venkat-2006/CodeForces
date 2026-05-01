import java.util.*;

public class CopilCopacDrawsTrees {//1830A

    static List<int[]>[] adj;
    static int ans;

    static void dfs(int node, int parent, int lastIdx, int readings) {
        ans = Math.max(ans, readings);

        for (int[] nei : adj[node]) {
            int next = nei[0];
            int idx = nei[1];

            if (next == parent) continue;

            if (idx > lastIdx) {
                dfs(next, node, idx, readings);
            } else {
                dfs(next, node, idx, readings + 1);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            adj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();

            for (int i = 1; i <= n - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj[u].add(new int[]{v, i});
                adj[v].add(new int[]{u, i});
            }

            ans = 1;
            dfs(1, -1, 0, 1);

            System.out.println(ans);
        }

        sc.close();
    }
}
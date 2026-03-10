import java.util.*;

public class WhiteBlackBalancedSubtrees { //1676G

    static List<Integer>[] tree;
    static String s;
    static int ans;

    static int dfs(int node) {

        int sum = (s.charAt(node - 1) == 'W') ? 1 : -1;

        for (int child : tree[node]) {
            sum += dfs(child);
        }

        if (sum == 0) ans++;

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            tree = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }

            for (int i = 2; i <= n; i++) {
                int parent = sc.nextInt();
                tree[parent].add(i);
            }

            s = sc.next();

            ans = 0;

            dfs(1);

            System.out.println(ans);
        }

        sc.close();
    }
}
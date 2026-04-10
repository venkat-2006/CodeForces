import java.util.*;

public class Queen {//1143C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] parent = new int[n + 1];
        int[] c = new int[n + 1];

        List<List<Integer>> children = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            children.add(new ArrayList<>());
        }

        int root = -1;

        for (int i = 1; i <= n; i++) {
            parent[i] = sc.nextInt();
            c[i] = sc.nextInt();

            if (parent[i] == -1) {
                root = i;
            } else {
                children.get(parent[i]).add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i == root) continue;

            if (c[i] == 1) {
                boolean ok = true;

                for (int child : children.get(i)) {
                    if (c[child] == 0) {
                        ok = false;
                        break;
                    }
                }

                if (ok) ans.add(i);
            }
        }

        if (ans.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(ans);
            for (int x : ans) {
                System.out.print(x + " ");
            }
        }
    }
}
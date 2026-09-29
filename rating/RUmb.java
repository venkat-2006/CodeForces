import java.util.*;

public class Rumb {//2264A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++) p[i] = sc.nextInt();

            List<Integer> bad = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (p[i] != i) bad.add(i);
            }

            if (bad.isEmpty()) {
                System.out.println("YES");
                continue;
            }

            int m = bad.size();
            boolean ok = true;
            for (int k = 0; k < m; k++) {
                if (p[bad.get(k)] != bad.get(m - 1 - k)) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}

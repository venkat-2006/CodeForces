import java.util.*;

public class Dungeon2 {//2164C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[][] mon = new int[m][2];
            for (int i = 0; i < m; i++) mon[i][0] = sc.nextInt();
            for (int i = 0; i < m; i++) mon[i][1] = sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(mon, (x, y) -> x[0] - y[0]);

            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int x : a) map.put(x, map.getOrDefault(x, 0) + 1);

            int ans = 0;

            for (int i = 0; i < m; i++) {
                Integer sword = map.ceilingKey(mon[i][0]);
                if (sword == null) continue;

                map.put(sword, map.get(sword) - 1);
                if (map.get(sword) == 0) map.remove(sword);

                ans++;

                if (mon[i][1] > 0) {
                    int nw = Math.max(sword, mon[i][1]);
                    map.put(nw, map.getOrDefault(nw, 0) + 1);
                }
            }

            System.out.println(ans);
        }
    }
}
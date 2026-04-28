import java.util.*;

public class Dungeon2 {//2164C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] b = new int[m];
            int[] c = new int[m];

            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            for (int i = 0; i < m; i++) c[i] = sc.nextInt();

            Arrays.sort(a);

            int[][] mon = new int[m][2];
            for (int i = 0; i < m; i++) {
                mon[i][0] = b[i];
                mon[i][1] = c[i];
            }

            Arrays.sort(mon, (x, y) -> Integer.compare(x[0], y[0]));

            TreeMap<Integer, Integer> swords = new TreeMap<>();
            for (int x : a) {
                swords.put(x, swords.getOrDefault(x, 0) + 1);
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            int i = 0, ans = 0;

            while (!swords.isEmpty()) {
                int strongest = swords.lastKey();

                while (i < m && mon[i][0] <= strongest) {
                    pq.add(mon[i][1]);
                    i++;
                }

                if (pq.isEmpty()) break;

                int reward = pq.poll();

                int sword = swords.firstKey();
                int cnt = swords.get(sword);
                if (cnt == 1) swords.remove(sword);
                else swords.put(sword, cnt - 1);

                ans++;

                if (reward > 0) {
                    int nw = Math.max(sword, reward);
                    swords.put(nw, swords.getOrDefault(nw, 0) + 1);
                }
            }

            System.out.println(ans);
        }
    }
}
import java.util.*;

public class Main { // Codeforces 2164C ////TLE without fast scanner etc

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {

            int n = sc.nextInt(); // number of initial elements
            int k = sc.nextInt(); // number of operations

            // TreeMap = sorted multiset (value -> frequency)
            TreeMap<Long, Integer> map = new TreeMap<>();

            // Read n numbers into multiset
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            // p[i][0] = f[i] (minimum required)
            // p[i][1] = s[i] (replacement value)
            long[][] p = new long[k][2];

            // Read all f[i]
            for (int i = 0; i < k; i++) 
                p[i][0] = sc.nextLong();

            // Read all s[i]
            for (int i = 0; i < k; i++) 
                p[i][1] = sc.nextLong();

            // Sort operations by f[i] (smallest requirement first)
            Arrays.sort(p, (a, b) -> Long.compare(a[0], b[0]));

            long ans = 0; // number of operations we can perform

            // ===============================
            // FIRST LOOP: handle s[i] != 0
            // ===============================
            for (int i = 0; i < k; i++) {

                // skip operations that don't give replacement
                if (p[i][1] == 0) continue;

                // find smallest number >= f[i]
                Long key = map.ceilingKey(p[i][0]);

                // if no valid number → stop everything
                if (key == null) break;

                // after using key, we insert max(s[i], key)
                long newVal = Math.max(p[i][1], key);

                // remove ONE occurrence of key
                if (map.get(key) == 1)
                    map.remove(key);
                else
                    map.put(key, map.get(key) - 1);

                // insert new value back into multiset
                map.put(newVal, map.getOrDefault(newVal, 0) + 1);

                ans++; // operation successful
            }

            // ===============================
            // SECOND LOOP: handle s[i] == 0
            // ===============================
            for (int i = 0; i < k; i++) {

                // skip operations that already handled
                if (p[i][1] != 0) continue;

                // find smallest number >= f[i]
                Long key = map.ceilingKey(p[i][0]);

                // if no valid number → stop
                if (key == null) break;

                // remove ONE occurrence
                if (map.get(key) == 1)
                    map.remove(key);
                else
                    map.put(key, map.get(key) - 1);

                ans++; // operation successful
            }

            // print result
            System.out.println(ans);
        }

        sc.close();
    }
}


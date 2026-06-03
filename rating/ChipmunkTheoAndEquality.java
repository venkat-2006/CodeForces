import java.util.*;

public class ChipmunkTheoAndEquality { // 2231C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> cnt = new HashMap<>();
            HashMap<Integer, Long> cost = new HashMap<>();

            for (int x : a) {

                HashSet<Integer> seen = new HashSet<>();

                int cur = x;
                long steps = 0;

                while (!seen.contains(cur)) {

                    seen.add(cur);

                    cnt.put(cur, cnt.getOrDefault(cur, 0) + 1);
                    cost.put(cur, cost.getOrDefault(cur, 0L) + steps);

                    if ((cur & 1) == 0) {
                        cur /= 2;    
                    } else {
                        cur += 1;    
                    }

                    steps++;
                }
            }

            long ans = Long.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {

                int value = entry.getKey();

                if (entry.getValue() == n) {
                    ans = Math.min(ans, cost.get(value));
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
import java.util.*;

public class DivisiblePairs { // 1931D

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Map<Long, Long> map = new HashMap<>();
            long ans = 0;

            long MOD = 1000000007L;

            for (int i = 0; i < n; i++) {

                long rx = a[i] % x;
                long ry = a[i] % y;

                long rx2 = (x - rx) % x;
                long ry2 = ry;

                long needKey = rx2 * MOD + ry2;

                ans += map.getOrDefault(needKey, 0L);

                long key = rx * MOD + ry;

                map.put(key, map.getOrDefault(key, 0L) + 1);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
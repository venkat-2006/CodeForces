import java.util.*;

public class ZeroRemainderArray { // 1374D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            HashMap<Long, Long> map = new HashMap<>();

            
            for (int i = 0; i < n; i++) {
                long rem = arr[i] % k;

                if (rem != 0) {
                    long need = k - rem;
                    map.put(need, map.getOrDefault(need, 0L) + 1);
                }
            }

            long ans = 0;

            for (Map.Entry<Long, Long> entry : map.entrySet()) {
                long need = entry.getKey();
                long count = entry.getValue();

                long moves = need + (count - 1) * k + 1;
                ans = Math.max(ans, moves);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
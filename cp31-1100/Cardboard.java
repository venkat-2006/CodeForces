import java.util.*;

public class Cardboard { // 1850E

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }

            long low = 1, high = 1_000_000_000L;
            long ans = 1;

            while (low <= high) {
                long mid = (low + high) / 2;
                long total = 0;

                for (int i = 0; i < n; i++) {
                    long side = s[i] + 2 * mid;
                    total += side * side;

                    if (total > c) break; 
                }

                if (total == c) {
                    ans = mid;
                    break;
                } else if (total < c) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

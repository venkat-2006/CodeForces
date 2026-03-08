import java.util.*;

public class ChatBan { // 1612C

    static long sum(long k, long m) {

        if (m <= k) {
            return m * (m + 1) / 2;
        }

        long inc = k * (k + 1) / 2;
        long d = m - k;

        long dec = d * (2 * k - d - 1) / 2;

        return inc + dec;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long k = sc.nextLong();
            long x = sc.nextLong();

            if (x >= k * k) {
                System.out.println(2 * k - 1);
                continue;
            }

            long l = 1, r = 2 * k - 1, ans = 2 * k - 1;

            while (l <= r) {

                long mid = (l + r) / 2;

                if (sum(k, mid) >= x) {
                    ans = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
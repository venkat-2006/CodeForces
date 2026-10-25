import java.util.*;

public class Kimp{//2268A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long ans = 0;

            if (2 * k <= n) {
                for (int i = k - 1; i <= n - k; i++)
                    ans += a[i];

                for (int i = 0; i < k - 1; i++)
                    ans += Math.max(a[i], a[n - 1 - i]);
            } else {
                for (int i = 0; i < n - k + 1; i++)
                    ans += Math.max(a[i], a[n - 1 - i]);
            }

            System.out.println(ans);
        }
    }
}

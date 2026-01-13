import java.util.*;
public class CountingOrders {//1827A
    static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            Arrays.sort(a);
            Arrays.sort(b);

            long ans = 1;

            for (int i = n - 1; i >= 0; i--) {
                int pos = upperBound(a, b[i]);
                int greater = n - pos;
                int used = (n - 1) - i;
                int choices = greater - used;

                if (choices <= 0) {
                    ans = 0;
                    break;
                }

                ans = (ans * choices) % MOD;
            }

            System.out.println(ans);
        }

        sc.close();
    }

    static int upperBound(long[] arr, long x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (arr[m] <= x) l = m + 1;
            else r = m;
        }
        return l;
    }
}

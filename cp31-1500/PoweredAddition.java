import java.util.*;

public class PoweredAddition {//1338A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            long max = a[0], need = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] < max) need = Math.max(need, max - a[i]);
                else max = a[i];
            }
            int ans = 0;
            while (((1L << ans) - 1) < need) ans++;
            System.out.println(ans);
        }
        sc.close();
    }
}
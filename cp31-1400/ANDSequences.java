import java.util.*;

public class ANDSequences {//1513B

    static final long MOD = 1000000007;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int x = a[0];
            for (int i = 1; i < n; i++) {
                x &= a[i];
            }

            int cnt = 0;
            for (int v : a) {
                if (v == x) cnt++;
            }

            if (cnt < 2) {
                System.out.println(0);
                continue;
            }

            long ans = (1L * cnt * (cnt - 1)) % MOD;

            for (int i = 1; i <= n - 2; i++) {
                ans = (ans * i) % MOD;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
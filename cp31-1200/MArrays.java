import java.util.*;

public class MArrays {//1497B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] cnt = new int[m];

            for (int i = 0; i < n; i++) {
                cnt[sc.nextInt() % m]++;
            }

            int ans = 0;

            if (cnt[0] > 0) ans++;

            for (int r = 1; r <= m / 2; r++) {
                if (r == m - r) {
                    if (cnt[r] > 0) ans++;
                } else {
                    int x = cnt[r];
                    int y = cnt[m - r];
                    if (x > 0 || y > 0) {
                        ans += Math.max(1, Math.abs(x - y));
                    }
                }
            }

            System.out.println(ans);
        }
    }
}

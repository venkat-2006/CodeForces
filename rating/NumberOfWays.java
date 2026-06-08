import java.util.*;

public class NumberOfWays { // 466C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        long total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            total += a[i];
        }

        if (total % 3 != 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        long target = total / 3;
        long prefix = 0;
        long cnt = 0;
        long ans = 0;

        for (int i = 0; i < n - 1; i++) {
            prefix += a[i];

            if (prefix == 2 * target) {
                ans += cnt;
            }

            if (prefix == target) {
                cnt++;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
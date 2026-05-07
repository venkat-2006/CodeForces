import java.util.*;

public class GoodSubArrays {//1736C1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            long ans = 0;
            int left = 1;

            for (int r = 1; r <= n; r++) {
                left = Math.max(left, r - a[r] + 1);
                ans += (r - left + 1);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
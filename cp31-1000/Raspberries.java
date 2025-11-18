import java.util.*;

public class Raspberries {//1883C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            long ans = Integer.MAX_VALUE;
            int evenCount = 0;

            for (int x : a) {
                if (x % 2 == 0) evenCount++;
                if (x % k == 0) ans = 0;
                ans = Math.min(ans, (k - (x % k)) % k);
            }

            if (k == 4) {
                if (evenCount >= 2) ans = 0;
                else if (evenCount == 1) ans = Math.min(ans, 1);
                else ans = Math.min(ans, 2);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

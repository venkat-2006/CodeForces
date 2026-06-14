import java.util.*;
public class Pride {//891A
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int ones = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) ones++;
        }
        if (ones > 0) {
            System.out.println(n - ones);
            return;
        }
        int overallGcd = a[0];
        for (int i = 1; i < n; i++) {
            overallGcd = gcd(overallGcd, a[i]);
        }

        if (overallGcd != 1) {
            System.out.println(-1);
            return;
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int g = 0;

            for (int j = i; j < n; j++) {
                g = gcd(g, a[j]);

                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        System.out.println(n + minLen - 2);
    }
}
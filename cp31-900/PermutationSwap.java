import java.util.*;

public class PermutationSwap { // 1828B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int gcd = 0;
            for (int i = 0; i < n; i++) {
                int diff = Math.abs(a[i] - (i + 1));
                gcd = gcd(gcd, diff);
            }

            System.out.println(gcd);
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

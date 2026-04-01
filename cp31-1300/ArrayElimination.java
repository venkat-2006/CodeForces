import java.util.*;

public class ArrayElimination { // 1601A
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] count = new int[31];

            for (int i = 0; i < n; i++) {
                for (int b = 0; b < 31; b++) {
                    if ((a[i] & (1 << b)) != 0) {
                        count[b]++;
                    }
                }
            }

            int g = 0;
            for (int b = 0; b < 31; b++) {
                if (count[b] > 0) {
                    g = gcd(g, count[b]);
                }
            }

            if (g == 0) {
                for (int k = 1; k <= n; k++) {
                    System.out.print(k + " ");
                }
            } else {
                for (int k = 1; k <= n; k++) {
                    if (g % k == 0) {
                        System.out.print(k + " ");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
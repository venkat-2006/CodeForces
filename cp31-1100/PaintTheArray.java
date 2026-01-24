import java.util.*;

public class PaintTheArray {//1618C
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long gcdEven = 0;
            for (int i = 1; i < n; i += 2) {
                gcdEven = gcd(gcdEven, a[i]);
            }

            boolean ok = true;
            for (int i = 0; i < n; i += 2) {
                if (gcdEven != 0 && a[i] % gcdEven == 0) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                System.out.println(gcdEven);
                continue;
            }

            long gcdOdd = 0;
            for (int i = 0; i < n; i += 2) {
                gcdOdd = gcd(gcdOdd, a[i]);
            }

            ok = true;
            for (int i = 1; i < n; i += 2) {
                if (gcdOdd != 0 && a[i] % gcdOdd == 0) {
                    ok = false;
                    break;
                }
            }

            if (ok) System.out.println(gcdOdd);
            else System.out.println(0);
        }
        sc.close();
    }
}

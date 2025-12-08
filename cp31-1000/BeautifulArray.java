import java.util.Scanner;

public class BeautifulArray {//1715B  almost did my logic is corrrect but small adjustment error ;)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            long need = b * k;

            if (s < need) {
                System.out.println(-1);
                continue;
            }

            long[] a = new long[(int)n];
            a[(int)n - 1] = need;
            long left = s - need;
            long maxExtra = (k - 1) * n;

            if (left > maxExtra) {
                System.out.println(-1);
                continue;
            }

            for (int i = 0; i < n; i++) {
                long add = Math.min(left, k - 1);
                a[i] += add;
                left -= add;
            }

            for (long v : a) System.out.print(v + " ");
            System.out.println();
        }

        sc.close();
    }
}

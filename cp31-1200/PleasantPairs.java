import java.util.*;

public class PleasantPairs {//1541B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int count = 0;

            for (int i = 1; i <= n; i++) {
                for (int product = a[i]; product <= 2 * n; product += a[i]) {
                    int j = product - i;
                    if (j > i && j <= n && a[i] * a[j] == i + j) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
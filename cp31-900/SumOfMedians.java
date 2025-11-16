import java.util.*;

public class SumOfMedians { //1440B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n * k];
            for (int i = 0; i < n * k; i++)
                a[i] = sc.nextLong();

            int m = (n + 1) / 2;
            int step = n - m + 1;

            long sum = 0;
            int idx = n * k - step;

            for (int i = 0; i < k; i++) {
                sum += a[idx];
                idx -= step;
            }

            System.out.println(sum);
        }
    }
}

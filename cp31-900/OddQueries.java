import java.util.*;

public class OddQueries {//1807D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            long[] prefix = new long[n + 1];
            for (int i = 1; i <= n; i++) prefix[i] = prefix[i - 1] + sc.nextLong();
            long total = prefix[n];
            while (q-- > 0) {
                int l = sc.nextInt(), r = sc.nextInt();
                long k = sc.nextLong();
                long rangeSum = prefix[r] - prefix[l - 1];
                long newSum = total - rangeSum + (r - l + 1) * k;
                System.out.println(newSum % 2 == 1 ? "YES" : "NO");
            }
        }
        sc.close();
    }
}

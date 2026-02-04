import java.util.*;

public class AlmostEqual {//1909B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            long k = 2;
            while (k <= 1000000000000000000L) {
                HashSet<Long> set = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    set.add(a[i] % k);
                    if (set.size() > 2) break;
                }
                if (set.size() == 2) {
                    System.out.println(k);
                    break;
                }
                k <<= 1;
            }
        }
    }
}

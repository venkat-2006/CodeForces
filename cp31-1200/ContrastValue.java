import java.util.*;

public class ContrastValue {//1832C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            List<Long> b = new ArrayList<>();
            b.add(a[0]);

            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    b.add(a[i]);
                }
            }

            if (b.size() == 1) {
                System.out.println(1);
                continue;
            }

            int ans = 2;

            for (int i = 1; i < b.size() - 1; i++) {
                long prev = b.get(i - 1);
                long curr = b.get(i);
                long next = b.get(i + 1);

                if ((curr > prev && curr > next) ||
                    (curr < prev && curr < next)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
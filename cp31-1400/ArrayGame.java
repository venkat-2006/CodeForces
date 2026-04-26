import java.util.*;

public class ArrayGame {//1904C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            if (k >= 3) {
                System.out.println(0);
                continue;
            }

            long ans = a[0];
            List<Long> diffs = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long d = Math.abs(a[j] - a[i]);
                    ans = Math.min(ans, d);
                    diffs.add(d);
                }
            }

            if (k == 1) {
                System.out.println(ans);
                continue;
            }

            Collections.sort(diffs);

            for (long d : diffs) {
                int idx = Arrays.binarySearch(a, d);

                if (idx >= 0) {
                    ans = 0;
                    break;
                } else {
                    idx = -idx - 1;

                    if (idx < n) {
                        ans = Math.min(ans, Math.abs(a[idx] - d));
                    }
                    if (idx > 0) {
                        ans = Math.min(ans, Math.abs(a[idx - 1] - d));
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
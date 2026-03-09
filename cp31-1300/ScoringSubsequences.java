import java.util.*;

public class ScoringSubsequences {//1794C
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int l = 1, r = i + 1;

                while (l <= r) {
                    int m = (l + r) / 2;
                    if (a[i - m + 1] >= m) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                }

                res.add(r);
            }

            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
import java.util.*;

public class MostSociallyDistancedSubsequence {//1364B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            List<Integer> res = new ArrayList<>();
            res.add(p[0]);

            for (int i = 1; i < n - 1; i++) {
                if ((p[i] > p[i - 1] && p[i] > p[i + 1]) ||
                    (p[i] < p[i - 1] && p[i] < p[i + 1])) {
                    res.add(p[i]);
                }
            }

            res.add(p[n - 1]);

            System.out.println(res.size());
            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
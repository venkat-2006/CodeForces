import java.util.*;

public class RemovingSmallestMultiples { // 1734C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            boolean[] removed = new boolean[n + 1];
            long cost = 0;

            for (int k = 1; k <= n; k++) {
                for (int j = k; j <= n; j += k) {

                    if (s.charAt(j - 1) == '1') break;

                    if (!removed[j]) {
                        removed[j] = true;
                        cost += k;
                    }
                }
            }

            System.out.println(cost);
        }

        sc.close();
    }
}
import java.util.*;

public class MaximalAND { // 1669H
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;

            for (int bit = 30; bit >= 0; bit--) {

                int count = 0;

                for (int i = 0; i < n; i++) {
                    if (((a[i] >> bit) & 1) == 1) {
                        count++;
                    }
                }

                int need = n - count;

                if (need <= k) {
                    k -= need;
                    ans |= (1 << bit);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
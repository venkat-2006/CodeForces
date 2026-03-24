import java.util.*;

public class Alyona {//1119B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long h = sc.nextLong();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int ans = 0;

        for (int k = 1; k <= n; k++) {
            int[] b = Arrays.copyOf(a, k);
            Arrays.sort(b);

            long height = 0;

            for (int i = k - 1; i >= 0; i -= 2) {
                height += b[i];
            }

            if (height <= h) {
                ans = k;
            }
        }

        System.out.println(ans);
    }
}
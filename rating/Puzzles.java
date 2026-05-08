import java.util.*;

public class Puzzles {//337A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            ans = Math.min(ans, a[i + n - 1] - a[i]);
        }

        System.out.println(ans);
    }
}
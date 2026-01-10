import java.util.*;

public class Tenzing {//1842B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            int cur = 0;

            for (int i = 0; i < n; i++) {
                if ((a[i] | x) != x) break;
                cur |= a[i];
            }

            for (int i = 0; i < n; i++) {
                if ((b[i] | x) != x) break;
                cur |= b[i];
            }

            for (int i = 0; i < n; i++) {
                if ((c[i] | x) != x) break;
                cur |= c[i];
            }

            System.out.println(cur == x ? "Yes" : "No");
        }
        sc.close();
    }
}

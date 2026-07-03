import java.util.*;

public class AnAlternativeWay {//2241D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n], b = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();
            for (int i = 1; i < n; i++) {
                a[i] += a[i - 1];
                b[i] += b[i - 1];
            }
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
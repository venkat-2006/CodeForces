import java.util.*;

public class StrangeBirthday { //1470A
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] k = new int[n];
            for (int i = 0; i < n; i++) k[i] = sc.nextInt();

            long[] c = new long[m];
            for (int i = 0; i < m; i++) c[i] = sc.nextLong();

            Arrays.sort(k);

            long ans = 0;
            int ptr = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (ptr < k[i]) {
                    ans += c[ptr];
                    ptr++;
                } else {
                    ans += c[k[i] - 1];
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
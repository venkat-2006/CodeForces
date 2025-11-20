import java.util.*;

public class Olya {//1859B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] mn = new long[n], smn = new long[n];

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long a1 = Long.MAX_VALUE, a2 = Long.MAX_VALUE;

                for (int j = 0; j < m; j++) {
                    long x = sc.nextLong();
                    if (x < a1) { a2 = a1; a1 = x; }
                    else if (x < a2) a2 = x;
                }

                mn[i] = a1;
                smn[i] = a2;
            }

            long gmn = Long.MAX_VALUE, sum = 0, smallestSecond = Long.MAX_VALUE;
            for (long x : mn) gmn = Math.min(gmn, x);
            for (long x : smn) { sum += x; smallestSecond = Math.min(smallestSecond, x); }

            System.out.println(gmn + (sum - smallestSecond));
        }
    }
}

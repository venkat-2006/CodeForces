import java.util.*;

public class ThreeActivities {//1914D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long[] c = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();
            for (int i = 0; i < n; i++) c[i] = sc.nextLong();

            int[] A = top3(a);
            int[] B = top3(b);
            int[] C = top3(c);

            long ans = 0;
            for (int i : A)
                for (int j : B)
                    for (int k : C)
                        if (i != j && j != k && i != k)
                            ans = Math.max(ans, a[i] + b[j] + c[k]);

            System.out.println(ans);
        }
    }

    static int[] top3(long[] x) {
        int p1 = -1, p2 = -1, p3 = -1;

        for (int i = 0; i < x.length; i++) {
            if (p1 == -1 || x[i] > x[p1]) {
                p3 = p2;
                p2 = p1;
                p1 = i;
            } else if (p2 == -1 || x[i] > x[p2]) {
                p3 = p2;
                p2 = i;
            } else if (p3 == -1 || x[i] > x[p3]) {
                p3 = i;
            }
        }
        return new int[]{p1, p2, p3};
    }
}

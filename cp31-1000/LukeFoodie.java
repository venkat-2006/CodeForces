import java.util.*;

public class LukeFoodie {//1704B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long L = a[0] - x;
            long R = a[0] + x;
            int changes = 0;

            for (int i = 1; i < n; i++) {
                long Li = a[i] - x;
                long Ri = a[i] + x;

                long newL = Math.max(L, Li);
                long newR = Math.min(R, Ri);

                if (newL <= newR) {
                    L = newL;
                    R = newR;
                } else {
                    changes++;
                    L = Li;
                    R = Ri;
                }
            }

            System.out.println(changes);
        }

        sc.close();
    }
}

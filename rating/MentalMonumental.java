import java.util.*;

public class MentalMonumental {//2226C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int mex = 0;

            for (int x : a) {
                if (x == mex || x >= 2 * mex + 1) {
                    mex++;
                }
            }

            System.out.println(mex);
        }
    }
}
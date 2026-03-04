import java.util.*;

public class DifferentOnes { // 1927D

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n + 2];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int[] nextDiff = new int[n + 2];
            nextDiff[n] = -1;

            for (int i = n - 1; i >= 1; i--) {

                if (a[i] != a[i + 1]) {
                    nextDiff[i] = i + 1;
                } else {
                    nextDiff[i] = nextDiff[i + 1];
                }
            }

            int q = sc.nextInt();

            while (q-- > 0) {

                int l = sc.nextInt();
                int r = sc.nextInt();

                int j = nextDiff[l];

                if (j == -1 || j > r) {
                    System.out.println("-1 -1");
                } else {
                    System.out.println(l + " " + j);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
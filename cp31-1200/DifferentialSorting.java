import java.util.*;

public class DifferentialSorting { // 1635C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {

            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println(0);
                continue;
            }

            if (a[n - 2] > a[n - 1] || a[n - 1] < 0) {
                System.out.println(-1);
                continue;
            }

            System.out.println(n - 2);
            for (int i = 0; i < n - 2; i++) {
                System.out.println((i + 1) + " " + (n - 1) + " " + n);
            }
        }

        sc.close();
    }
}
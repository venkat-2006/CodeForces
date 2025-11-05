import java.util.*;

public class MakeItIncreasing {//1675B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long operations = 0;
            boolean possible = true;

           
            for (int i = n - 2; i >= 0; i--) {
                while (a[i] >= a[i + 1] && a[i] > 0) {
                    a[i] /= 2;
                    operations++;
                }

                if (a[i] >= a[i + 1]) {
                    possible = false;
                    break;
                }
            }

            if (possible)
                System.out.println(operations);
            else
                System.out.println(-1);
        }

        sc.close();
    }
}

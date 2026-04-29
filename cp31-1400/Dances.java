import java.util.*;

public class Dances {//1883G1
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int[] c = new int[n];
            c[0] = 1;
            for (int i = 1; i < n; i++) {
                c[i] = a[i - 1];
            }

            Arrays.sort(c);
            Arrays.sort(b);

            int i = 0, j = 0;
            int matches = 0;

            while (i < n && j < n) {
                if (c[i] < b[j]) {
                    matches++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }

            System.out.println(n - matches);
        }

        sc.close();
    }
}
import java.util.*;

public class NegativesAndPositives {//1791E
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            int negs = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < 0) {
                    negs++;
                    a[i] = -a[i];
                }
                sum += a[i];
            }

            Arrays.sort(a);

            if (negs % 2 == 1) {
                sum -= 2L * a[0];
            }

            System.out.println(sum);
        }

        sc.close();
    }
}

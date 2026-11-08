import java.util.*;

public class MathPhy{//2278C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            boolean middle = false;

            for (int i = 1; i < n - 1; i++) {
                if (a[i] >= 2) {
                    middle = true;
                    break;
                }
            }

            if (middle) {
                System.out.println(sum - 1);
            } else if (a[0] >= 2 && a[n - 1] >= 2) {
                System.out.println(a[0] + a[n - 1] - 1);
            } else if (a[0] >= 2) {
                System.out.println(a[0]);
            } else if (a[n - 1] >= 2) {
                System.out.println(a[n - 1]);
            } else {
                System.out.println(-1);
            }
        }
    }
}

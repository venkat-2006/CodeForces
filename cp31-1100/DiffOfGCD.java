import java.util.*;

public class DiffOfGCD { // 1708B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();

            long[] arr = new long[n];
            boolean ok = true;
            for (int i = 1; i <= n; i++) {
                long ai = ((l + i - 1) / i) * i;
                if (ai > r) {
                    ok = false;
                    break;
                }
                arr[i - 1] = ai;
            }

            if (!ok) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

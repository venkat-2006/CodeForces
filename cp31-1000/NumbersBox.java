import java.util.*;

public class NumbersBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long sum = 0;
            int neg = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    if (x < 0) neg++;
                    sum += Math.abs(x);
                    min = Math.min(min, Math.abs(x));
                }
            }

            if (neg % 2 == 1) sum -= 2L * min;
            System.out.println(sum);
        }
    }
}

import java.util.*;

public class BuyingShovels { // 1360D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int maxDiv = 1;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {

                    if (i <= k) {
                        maxDiv = Math.max(maxDiv, i);
                    }

                    int other = n / i;
                    if (other <= k) {
                        maxDiv = Math.max(maxDiv, other);
                    }
                }
            }

            System.out.println(n / maxDiv);
        }

        sc.close();
    }
}
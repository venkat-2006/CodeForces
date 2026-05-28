import java.util.*;

public class OptimalPurchase {//2230A

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans;

            if (3 * a <= b) {
                ans = n * a;
            } else {

                long groups = n / 3;
                long rem = n % 3;

                ans = groups * b + Math.min(rem * a, b);
            }

            System.out.println(ans);
        }
    }
}
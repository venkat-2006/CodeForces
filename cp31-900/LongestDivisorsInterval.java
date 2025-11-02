import java.util.*;

public class LongestDivisorsInterval {//1855B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 1;
            for (long i = 1; i <= 100; i++) {
                if (n % i == 0) ans = i;
                else break;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

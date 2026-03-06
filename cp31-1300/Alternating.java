import java.util.*;

public class Alternating { // 1879C

    static final long MOD = 998244353;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();
            int n = s.length();

            long operations = 0;
            long ways = 1;

            int count = 1;

            for (int i = 1; i < n; i++) {

                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    operations += count - 1;
                    ways = (ways * count) % MOD;
                    count = 1;
                }
            }

            operations += count - 1;
            ways = (ways * count) % MOD;

            long fact = 1;

            for (long i = 1; i <= operations; i++) {
                fact = (fact * i) % MOD;
            }

            ways = (ways * fact) % MOD;

            System.out.println(operations + " " + ways);
        }

        sc.close();
    }
}
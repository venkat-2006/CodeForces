import java.util.*;

public class Demodogs { // 1731B
    static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = ((((n * (n + 1)) % MOD) * (4 * n - 1)) % MOD * 337) % MOD;
            System.out.println(ans);
        }
    }
}

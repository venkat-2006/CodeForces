import java.util.*;

public class twoDTravelling {//1869B

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        long[] x = new long[n + 1];
        long[] y = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            x[i] = scanner.nextLong();
            y[i] = scanner.nextLong();
        }

        long ans = Math.abs(x[s] - x[t]) + Math.abs(y[s] - y[t]);

        if (k > 0) {
            long mins = Long.MAX_VALUE;
            long mint = Long.MAX_VALUE;

            for (int i = 1; i <= k; i++) {
                mins = Math.min(mins, Math.abs(x[s] - x[i]) + Math.abs(y[s] - y[i]));
                mint = Math.min(mint, Math.abs(x[t] - x[i]) + Math.abs(y[t] - y[i]));
            }

            ans = Math.min(ans, mins + mint);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
}

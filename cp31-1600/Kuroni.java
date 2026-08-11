import java.util.*;

public class Kuroni { // 1305C

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        // More numbers than possible remainders
        // => two numbers must have same remainder
        // => their difference is divisible by m
        // => answer is 0
        if (n > m) {
            System.out.println(0);
            return;
        }

        long ans = 1;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                long diff = Math.abs(a[i] - a[j]);

                ans = (ans * (diff % m)) % m;
            }
        }

        System.out.println(ans);
    }
}
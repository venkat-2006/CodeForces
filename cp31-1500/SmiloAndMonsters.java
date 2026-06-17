import java.util.*;

public class SmiloAndMonsters {//1891C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }

            Arrays.sort(a);

            long rem = sum / 2;
            long ans = sum - rem;

            for (int i = n - 1; i >= 0 && rem > 0; i--) {
                rem -= a[i];
                ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
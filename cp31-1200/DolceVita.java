import java.util.*;

public class DolceVita {//1671C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {

            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long prefix = 0;
            long ans = 0;

            for (int k = 1; k <= n; k++) {
                prefix += arr[k - 1];

                if (prefix > x) break;

                long days = (x - prefix) / k + 1;
                ans += days;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
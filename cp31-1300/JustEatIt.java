import java.util.*;

public class JustEatIt {

    static long kadane(int[] a, int l, int r) {
        long cur = a[l], maxSum = a[l];
        for (int i = l + 1; i <= r; i++) {
            cur = Math.max(a[i], cur + a[i]);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            long total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                total += a[i];
            }

            long leftMax = kadane(a, 0, n - 2);  
            long rightMax = kadane(a, 1, n - 1);  

            long best = Math.max(leftMax, rightMax);

            if (total > best) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
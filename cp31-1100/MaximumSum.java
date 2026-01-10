import java.util.*;

public class MaximumSum {//1832B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

            Arrays.sort(arr);

            long total = 0;
            long[] pre = new long[n];
            pre[0] = arr[0];
            total += arr[0];
            for (int i = 1; i < n; i++) {
                total += arr[i];
                pre[i] = pre[i - 1] + arr[i];
            }

            long ans = 0;

            for (int i = 0; i <= k; i++) {
                int front = 2 * i;
                int back = k - i;
                if (front + back > n) continue;

                long sumFront = (front == 0 ? 0 : pre[front - 1]);
                long sumBack = (back == 0 ? 0 : total - pre[n - back - 1]);

                ans = Math.max(ans, total - sumFront - sumBack);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

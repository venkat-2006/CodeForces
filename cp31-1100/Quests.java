import java.util.Scanner;

public class Quests { // 1914C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            long ans = 0;
            long sumA = 0;
            int maxB = 0;

            for (int i = 0; i < n && i < k; i++) {
                sumA += a[i];
                maxB = Math.max(maxB, b[i]);

                long total = sumA + (long)(k - i - 1) * maxB;
                ans = Math.max(ans, total);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

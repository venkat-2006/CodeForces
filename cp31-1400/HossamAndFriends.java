import java.util.*;

public class HossamAndFriends {//1771B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] maxBadLeft = new int[n + 1];

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                int a = Math.min(x, y); 
                int b = Math.max(x, y);

                maxBadLeft[b] = Math.max(maxBadLeft[b], a);
            }

            long ans = 0;
            int left = 1;

            for (int right = 1; right <= n; right++) {
                left = Math.max(left, maxBadLeft[right] + 1);
                ans += (right - left + 1);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
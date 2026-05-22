import java.util.*;

public class TwoPowerSort {//1692G

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            int streak = 0;

            for (int i = 0; i < n - 1; i++) {

                if (arr[i] < 2L * arr[i + 1]) {
                    streak++;
                } else {
                    streak = 0;
                }

                if (streak >= k) {
                    ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
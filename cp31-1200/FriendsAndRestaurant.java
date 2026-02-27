import java.util.*;

public class FriendsAndRestaurant {//1729D

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            long[] d = new long[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                y[i] = sc.nextLong();
                d[i] = y[i] - x[i];
            }

            Arrays.sort(d);

            int left = 0;
            int right = n - 1;
            int groups = 0;

            while (left < right) {
                if (d[left] + d[right] >= 0) {
                    groups++;
                    left++;
                    right--;
                } else {
                    left++;
                }
            }

            System.out.println(groups);
        }

        sc.close();
    }
}
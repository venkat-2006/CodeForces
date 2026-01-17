import java.util.*;

public class Candies { // 1669F
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }

            int i = 0, j = n - 1;
            long left = 0, right = 0;
            int eatenLeft = 0, eatenRight = 0;
            int ans = 0;

            while (i <= j) {
                if (left == right) {
                    ans = Math.max(ans, eatenLeft + eatenRight);
                }

                if (left <= right) {
                    left += arr[i];
                    eatenLeft++;
                    i++;
                } else {
                    right += arr[j];
                    eatenRight++;
                    j--;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}

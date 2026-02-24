import java.util.*;

public class Casino { // 1808B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] cards = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    cards[i][j] = sc.nextInt();
                }
            }

            long total = 0;

            for (int col = 0; col < m; col++) {
                int[] arr = new int[n];

                for (int row = 0; row < n; row++) {
                    arr[row] = cards[row][col];
                }

                Arrays.sort(arr);

                long prefix = 0;

                for (int i = 0; i < n; i++) {
                    total += (long) arr[i] * i - prefix;
                    prefix += arr[i];
                }
            }

            System.out.println(total);
        }
    }
}
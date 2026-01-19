import java.util.*;

public class Pattern { // 1797B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int count = 0;

            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] != arr[n - 1 - i][n - 1 - j]) {
                        count++;
                    }
                }
            }

            count /= 2; 

            if (count > k) {
                System.out.println("NO");
            } else {
                long temp = k - count;
                if (temp % 2 == 0) {
                    System.out.println("YES");
                } else {
                    if (n % 2 == 0) System.out.println("NO");
                    else System.out.println("YES");
                }
            }
        }

        sc.close();
    }
}

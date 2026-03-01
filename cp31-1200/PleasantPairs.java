import java.util.*;

public class PleasantPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long[][] arr = new long[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = scanner.nextLong();
                arr[i][1] = i + 1;
            }

            Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));

            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i][0] * arr[j][0] > 2L * n) {
                        break;
                    }

                    if (arr[i][0] * arr[j][0] == arr[i][1] + arr[j][1]) {
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}
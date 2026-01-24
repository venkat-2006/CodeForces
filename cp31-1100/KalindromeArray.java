import java.util.*;

public class KalindromeArray { // 1610B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int i = 0, j = n - 1;
            int l = -1, r = -1;

            while (i < j) {
                if (arr[i] != arr[j]) {
                    l = arr[i];
                    r = arr[j];
                    break;
                }
                i++;
                j--;
            }

            if (l == -1) {
                System.out.println("YES");
                continue;
            }

            i = 0; j = n - 1;
            boolean x = true;
            while (i < j) {
                if (arr[i] == l) {
                    i++;
                    continue;
                }
                if (arr[j] == l) {
                    j--;
                    continue;
                }
                if (arr[i] != arr[j]) {
                    x = false;
                    break;
                }
                i++;
                j--;
            }

            i = 0; j = n - 1;
            boolean y = true;
            while (i < j) {
                if (arr[i] == r) {
                    i++;
                    continue;
                }
                if (arr[j] == r) {
                    j--;
                    continue;
                }
                if (arr[i] != arr[j]) {
                    y = false;
                    break;
                }
                i++;
                j--;
            }

            if (x || y) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}

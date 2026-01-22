import java.util.*;

public class EvenSubArrays { // 1631B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int x = arr[n - 1];
            int len = 1;
            int ans = 0;
            int i = n - 2;

            while (i >= 0) {
                if (arr[i] == x) {
                    i--;
                } else {
                    ans++;
                    i -= len;
                    len *= 2;
                }
            }

            System.out.println(ans);
        }
    }
}

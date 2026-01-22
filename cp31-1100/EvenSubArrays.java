import java.util.*;

public class EvenSubArrays {//1631B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int ans = 0;
            int x = a[n - 1];
            int len = 1;

            while (len < n) {
                int idx = n - len - 1; 

                if (idx >= 0 && a[idx] == x) {
                    len++;
                } else {
                    ans++;
                    len *= 2;
                }
            }

            System.out.println(ans);
        }
    }
}

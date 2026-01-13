import java.util.*;

public class SortTheSubarray {//1821B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int l = 0;
            while (a[l] == b[l]) l++;

            int r = n - 1;
            while (a[r] == b[r]) r--;

            int mn = b[l], mx = b[l];
            for (int i = l; i <= r; i++) {
                mn = Math.min(mn, b[i]);
                mx = Math.max(mx, b[i]);
            }

            while (l > 0 && a[l - 1] <= mn) l--;
            while (r < n - 1 && a[r + 1] >= mx) r++;

            System.out.println((l + 1) + " " + (r + 1));
        }
        sc.close();
    }
}

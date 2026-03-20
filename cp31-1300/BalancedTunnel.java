import java.util.*;

public class BalancedTunnel {//1237B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        int[] pos = new int[n + 1];

        for (int i = 0; i < n; i++) pos[a[i]] = i;

        int min = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            int curr = pos[b[i]];
            if (curr > min) ans++;
            min = Math.min(min, curr);
        }

        System.out.println(ans);

        sc.close();
    }
}
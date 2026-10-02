import java.util.*;

public class WhatASauSaGe { // 2268B
    static int good(int x) {
        return Integer.bitCount(x) % 2 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            int[] a = new int[n];
            int ans = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                ans += good(a[i]);
            }

            System.out.print(ans);

            while (q-- > 0) {
                int p = sc.nextInt() - 1, x = sc.nextInt();
                ans += good(x) - good(a[p]);
                a[p] = x;
                System.out.print(" " + ans);
            }
            System.out.println();
        }
    }
}

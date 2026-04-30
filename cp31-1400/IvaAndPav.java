import java.util.*;
public class IvaAndPav {//1878E
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[][] nextZero = new int[n][31];
            for (int b = 0; b < 31; b++) {
                if ((a[n - 1] & (1 << b)) == 0)
                    nextZero[n - 1][b] = n - 1;
                else
                    nextZero[n - 1][b] = n;
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int b = 0; b < 31; b++) {
                    if ((a[i] & (1 << b)) == 0)
                        nextZero[i][b] = i;
                    else
                        nextZero[i][b] = nextZero[i + 1][b];
                }
            }
            int q = sc.nextInt();
            while (q-- > 0) {
                int l = sc.nextInt() - 1;
                int k = sc.nextInt();
                if (a[l] < k) {
                    out.append(-1).append(" ");
                    continue;
                }
                int lo = l, hi = n - 1, ans = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    int andVal = 0;
                    for (int b = 0; b < 31; b++) {
                        if (nextZero[l][b] > mid) {
                            andVal |= (1 << b);
                        }
                    }
                    if (andVal >= k) {
                        ans = mid;
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
                out.append(ans + 1).append(" ");
            }
            out.append("\n");
        }
        System.out.print(out);
        sc.close();
    }
}
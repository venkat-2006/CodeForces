import java.util.*;

public class JumpingThroughSegments {//1907D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] seg = new int[n][2];

            for (int i = 0; i < n; i++) {
                seg[i][0] = sc.nextInt();
                seg[i][1] = sc.nextInt();
            }

            long low = 0, high = (long)1e9;
            long ans = high;

            while (low <= high) {
                long mid = (low + high) / 2;

                if (can(seg, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }

    static boolean can(int[][] seg, long k) {
        long L = 0, R = 0;

        for (int i = 0; i < seg.length; i++) {
            long l = seg[i][0];
            long r = seg[i][1];

            long newL = Math.max(l, L - k);
            long newR = Math.min(r, R + k);

            if (newL > newR) return false;

            L = newL;
            R = newR;
        }

        return true;
    }
}
import java.util.*;

public class ScheduleManagement { // 1701C

    static boolean possible(int time, int[] cnt, int n) {
        long extra = 0;   // tasks left from overloaded workers
        long help = 0;    // capacity from free workers

        for (int i = 1; i <= n; i++) {
            if (cnt[i] > time) {
                extra += cnt[i] - time;
            } else {
                help += (time - cnt[i]) / 2;
            }
        }

        return help >= extra;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] cnt = new int[n + 1];

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                cnt[x]++;
            }

            int low = 1, high = 2 * m;
            int ans = high;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (possible(mid, cnt, n)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            out.append(ans).append("\n");
        }

        System.out.print(out);
        sc.close();
    }
}
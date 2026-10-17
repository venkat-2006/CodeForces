import java.util.*;

public class UnrequitedLove{//2275C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int[] arr = new int[n - 4];
            Map<Integer, Long> mp = new HashMap<>();
            long ans = 0;

            for (int i = 0; i < n - 4; i++) {
                int cur = a[i] + a[i + 2] - a[i + 4];

                ans += mp.getOrDefault(cur, 0L);

                if (i >= 2 && arr[i - 2] == cur)
                    ans--;

                if (i >= 4 && arr[i - 4] == cur)
                    ans--;

                mp.put(cur, mp.getOrDefault(cur, 0L) + 1);
                arr[i] = cur;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

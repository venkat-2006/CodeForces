import java.util.*;

public class BerlandRegional {//1519C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int u[] = new int[n];
            int s[] = new int[n];

            for (int i = 0; i < n; i++) u[i] = sc.nextInt();
            for (int i = 0; i < n; i++) s[i] = sc.nextInt();

            Map<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.putIfAbsent(u[i], new ArrayList<>());
                map.get(u[i]).add(s[i]);
            }

            ArrayList<long[]> groups = new ArrayList<>();

            for (ArrayList<Integer> list : map.values()) {
                Collections.sort(list, Collections.reverseOrder());

                int m = list.size();
                long[] prefix = new long[m];

                prefix[0] = list.get(0);
                for (int i = 1; i < m; i++) {
                    prefix[i] = prefix[i - 1] + list.get(i);
                }

                groups.add(prefix);
            }

            long[] ans = new long[n + 1];

            for (long[] prefix : groups) {
                int m = prefix.length;

                for (int k = 1; k <= m; k++) {
                    int usable = (m / k) * k;
                    if (usable > 0) {
                        ans[k] += prefix[usable - 1];
                    }
                }
            }

            for (int k = 1; k <= n; k++) {
                System.out.print(ans[k] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
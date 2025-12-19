import java.util.*;

public class CollectingGame {//1904B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long[] sorted = arr.clone();
            Arrays.sort(sorted);

            long[] prefix = new long[n];
            prefix[0] = sorted[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + sorted[i];
            }

            int[] reach = new int[n];
            reach[n - 1] = n - 1;

            for (int i = n - 2; i >= 0; i--) {
                if (prefix[i] >= sorted[i + 1]) {
                    reach[i] = reach[i + 1];
                } else {
                    reach[i] = i;
                }
            }

            Map<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(sorted[i], reach[i]);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(map.get(arr[i]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

import java.util.*;

public class Differences {//1520D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            HashMap<Integer, Long> freq = new HashMap<>();
            long ans = 0;

            for (int i = 0; i < n; i++) {
                int key = a[i] - i;
                if (freq.containsKey(key)) {
                    ans += freq.get(key);
                }
                freq.put(key, freq.getOrDefault(key, 0L) + 1);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}

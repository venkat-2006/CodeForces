import java.util.*;

public class CandyBox { // 1183D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            ArrayList<Integer> counts = new ArrayList<>(freq.values());
            counts.sort(Collections.reverseOrder());

            HashSet<Integer> used = new HashSet<>();
            int ans = 0;

            for (int count : counts) {
                while (count > 0 && used.contains(count)) {
                    count--;
                }

                if (count > 0) {
                    used.add(count);
                    ans += count;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
import java.util.*;

public class Erase {//1917B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            Map<Character, Integer> freq = new HashMap<>();
            int count = 0;
            int[] distinct = new int[n];

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
                if (freq.get(c) == 1) {
                    count++;
                }
                distinct[i] = count;
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += distinct[i];
            }

            System.out.println(ans);
        }
    }
}

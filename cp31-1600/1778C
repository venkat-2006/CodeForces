import java.util.*;

public class FlexibleString {//1778C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String a = sc.next(), b = sc.next();

            boolean[] seen = new boolean[26];
            ArrayList<Character> chars = new ArrayList<>();

            for (char ch : a.toCharArray()) {
                if (!seen[ch - 'a']) {
                    seen[ch - 'a'] = true;
                    chars.add(ch);
                }
            }

            int m = chars.size(), need = Math.min(k, m);
            int[] id = new int[26];
            Arrays.fill(id, -1);

            for (int i = 0; i < m; i++)
                id[chars.get(i) - 'a'] = i;

            long ans = 0;

            for (int mask = 0; mask < (1 << m); mask++) {
                if (Integer.bitCount(mask) != need)
                    continue;

                long cur = 0, len = 0;

                for (int i = 0; i < n; i++) {
                    int bit = id[a.charAt(i) - 'a'];
                    boolean selected = (mask & (1 << bit)) != 0;

                    if (a.charAt(i) == b.charAt(i) || selected) {
                        len++;
                    } else {
                        cur += len * (len + 1) / 2;
                        len = 0;
                    }
                }

                cur += len * (len + 1) / 2;
                ans = Math.max(ans, cur);
            }

            System.out.println(ans);
        }
    }
}

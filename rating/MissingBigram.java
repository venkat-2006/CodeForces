import java.util.*;

public class MissingBigram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] s = new String[n - 2];
            for (int i = 0; i < n - 2; i++) s[i] = sc.next();

            StringBuilder ans = new StringBuilder();
            ans.append(s[0].charAt(0));
            boolean found = false;

            for (int i = 0; i < n - 3; i++) {
                ans.append(s[i].charAt(1));
                if (s[i].charAt(1) != s[i + 1].charAt(0)) {
                    ans.append(s[i + 1].charAt(0));
                    found = true;
                }
            }

            ans.append(s[n - 3].charAt(1));
            if (!found) ans.append('a');
            System.out.println(ans);
        }
    }
}
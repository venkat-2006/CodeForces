import java.util.*;

public class Saraga { // 2045C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();

        int n = S.length();
        int m = T.length();

     
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int j = 0; j < m - 1; j++) {
            last[T.charAt(j) - 'a'] = j;
        }

        String ans = null;

        for (int i = 1; i < n; i++) {

            char ch = S.charAt(i);
            int idx = last[ch - 'a'];

    
            if (idx != -1) {

                String candidate = S.substring(0, i + 1) + T.substring(idx + 1);

                if (ans == null || candidate.length() < ans.length()) {
                    ans = candidate;
                }
            }
        }

        System.out.println(ans == null ? "-1" : ans);
    }
}
import java.util.*;

public class Saraga { // 2045C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();

        int n = S.length();
        int m = T.length();

        int[] first = new int[26];
        Arrays.fill(first, -1);

    
        for (int j = 0; j < m; j++) {
            int c = T.charAt(j) - 'a';
            if (first[c] == -1) {
                first[c] = j;
            }
        }

        String ans = null;

        for (int i = 1; i < n; i++) {

            char ch = S.charAt(i);
            int idx = first[ch - 'a'];

            
            if (idx != -1 && idx < m - 1) {

                String candidate = S.substring(0, i + 1) + T.substring(idx + 1);

                if (ans == null || candidate.length() < ans.length()) {
                    ans = candidate;
                }
            }
        }

        
        if (ans == null) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}
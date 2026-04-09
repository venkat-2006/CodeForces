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

        int bestLen = Integer.MAX_VALUE;
        int bestI = -1, bestJ = -1;

        for (int i = 1; i < n; i++) {

            int j = last[S.charAt(i) - 'a'];

            if (j != -1) {

                int len = (i + 1) + (m - j - 1);

                if (len < bestLen) {
                    bestLen = len;
                    bestI = i;
                    bestJ = j;
                }
            }
        }

        if (bestI == -1) {
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= bestI; i++) {
            sb.append(S.charAt(i));
        }

        for (int j = bestJ + 1; j < m; j++) {
            sb.append(T.charAt(j));
        }

        System.out.println(sb.toString());
    }
}
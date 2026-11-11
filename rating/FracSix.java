import java.util.Scanner;

public class FracSix{//2278A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String p = sc.next();
            String q = sc.next();
            int[] countP = new int[26];
            int[] countQ = new int[26];
            for (int i = 0; i < n; i++) countP[p.charAt(i) - 'a']++;
            for (int i = 0; i < m; i++) countQ[q.charAt(i) - 'a']++;
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);
                if (c == 's' || c == 'i' || c == 'x') {
                    if (countP[i] != countQ[i] + 1) {
                        possible = false;
                        break;
                    }
                } else {
                    if (countP[i] != countQ[i]) {
                        possible = false;
                        break;
                    }
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}

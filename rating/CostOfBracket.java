import java.util.*;
 
public class CostOfBracket{//2233C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
 
            int[] po = new int[n + 1];
            int[] pc = new int[n + 1];
 
            for (int i = 0; i < n; i++) {
                po[i + 1] = po[i] + (s.charAt(i) == '(' ? 1 : 0);
                pc[i + 1] = pc[i] + (s.charAt(i) == ')' ? 1 : 0);
            }
 
            int totalClose = pc[n];
 
            int best = n + 1;
            int split = 0;
 
            for (int i = 0; i <= n; i++) {
                int need = po[i] + (totalClose - pc[i]);
 
                if (need < best) {
                    best = need;
                    split = i;
                }
            }
 
            int d = Math.min(k, best);
 
            char[] ans = new char[n];
            Arrays.fill(ans, '0');
 
            for (int i = 0; i < split && d > 0; i++) {
                if (s.charAt(i) == '(') {
                    ans[i] = '1';
                    d--;
                }
            }
 
            for (int i = n - 1; i >= split && d > 0; i--) {
                if (s.charAt(i) == ')') {
                    ans[i] = '1';
                    d--;
                }
            }
 
            System.out.println(new String(ans));
        }
    }
}

import java.util.*;
 
public class DistinctSplit { //1791D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int[] left = new int[n];
            int[] right = new int[n];
 
            HashSet<Character> set = new HashSet<>();
 
            for (int i = 0; i < n; i++) {
                set.add(s.charAt(i));
                left[i] = set.size();
            }
 
            set.clear();
 
            for (int i = n - 1; i >= 0; i--) {
                set.add(s.charAt(i));
                right[i] = set.size();
            }
 
            int ans = 0;
 
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, left[i] + right[i + 1]);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}

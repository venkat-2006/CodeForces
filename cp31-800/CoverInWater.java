import java.util.*;

public class CoverInWater {//1900A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            int i = 0;
            while (i < n) {
                if (s.charAt(i) == '#') {
                    i++;
                    continue;
                }
                int len = 0;
                while (i < n && s.charAt(i) == '.') {
                    len++;
                    i++;
                }
                ans += (len + 2) / 3;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

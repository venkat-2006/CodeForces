import java.util.*;

public class WowFactor { //1178B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length();
        long totalW = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'v' && s.charAt(i + 1) == 'v') {
                totalW++;
            }
        }

        long leftW = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'o') {
                long rightW = totalW - leftW;
                ans += leftW * rightW;
            }

            if (i < n - 1 && s.charAt(i) == 'v' && s.charAt(i + 1) == 'v') {
                leftW++;
            }
        }

        System.out.println(ans);
    }
}
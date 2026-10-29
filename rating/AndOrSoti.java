
import java.util.*;

public class AndOrSoti {//2266C
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int z = 0;
        int o = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                z++;
            }
        }

        if (s.charAt(0) == '1') {
            System.out.println(z);
            return;
        }

        int ans = (int) 1e9;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                o++;
            } else {
                z--;
            }

            ans = Math.min(ans, o + z);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}

import java.util.*;

public class Jojo { // 1820B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            int maxi = 0;
            int i = 0;

            while (i < n) {
                if (s.charAt(i) == '0') {
                    i++;
                    continue;
                }
                int j = i;
                while (j < n && s.charAt(j) == '1') j++;
                maxi = Math.max(maxi, j - i);
                i = j;
            }

            if (maxi == n) {
                System.out.println(1L * n * n);
                continue;
            }

            int prefix = 0;
            while (prefix < n && s.charAt(prefix) == '1') prefix++;

            int suffix = 0;
            int k = n - 1;
            while (k >= 0 && s.charAt(k) == '1') {
                suffix++;
                k--;
            }

            maxi = Math.max(maxi, prefix + suffix);

            long a = maxi / 2;
            long b = (maxi + 1) / 2;
            System.out.println(a * b);
        }
        sc.close();
    }
}

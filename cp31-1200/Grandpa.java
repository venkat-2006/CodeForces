import java.util.*;

public class Grandpa {//1582C

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int l = 0;
            int r = n - 1;

            while (l < r && s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }

            if (l >= r) {
                System.out.println(0);
                continue;
            }

            int ans1 = check(s, s.charAt(l));
            int ans2 = check(s, s.charAt(r));

            if (ans1 == -1 && ans2 == -1) {
                System.out.println(-1);
            } else if (ans1 == -1) {
                System.out.println(ans2);
            } else if (ans2 == -1) {
                System.out.println(ans1);
            } else {
                System.out.println(Math.min(ans1, ans2));
            }
        }

        sc.close();
    }

    static int check(String s, char c) {
        int l = 0;
        int r = s.length() - 1;
        int count = 0;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                if (s.charAt(l) == c) {
                    l++;
                    count++;
                } else if (s.charAt(r) == c) {
                    r--;
                    count++;
                } else {
                    return -1;
                }
            }
        }

        return count;
    }
}
import java.util.*;

public class Equal {//1594C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            boolean allC = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != c) {
                    allC = false;
                    break;
                }
            }

            if (allC) {
                System.out.println(0);
                continue;
            }

            int goodIndex = -1;
            for (int i = 1; i <= n; i++) {
                boolean ok = true;
                for (int j = i; j <= n; j += i) {
                    if (s.charAt(j - 1) != c) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    goodIndex = i;
                    break;
                }
            }

            if (goodIndex != -1) {
                System.out.println(1);
                System.out.println(goodIndex);
            } else {
                System.out.println(2);
                System.out.println((n - 1) + " " + n);
            }
        }
    }
}

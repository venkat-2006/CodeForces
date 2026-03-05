import java.util.*;

public class RomanticGlasses { //1915E
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            HashSet<Long> set = new HashSet<>();
            long prefix = 0;
            boolean ok = false;

            set.add(0L);

            for (int i = 1; i <= n; i++) {

                long x = sc.nextLong();

                if (i % 2 == 0) x = -x;

                prefix += x;

                if (set.contains(prefix)) {
                    ok = true;
                }

                set.add(prefix);
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}
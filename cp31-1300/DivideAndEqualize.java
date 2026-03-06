import java.util.*;

public class DivideAndEqualize { // 1881D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                for (int p = 2; p * p <= x; p++) {
                    while (x % p == 0) {
                        map.put(p, map.getOrDefault(p, 0) + 1);
                        x /= p;
                    }
                }

                if (x > 1) {
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }
            }

            boolean ok = true;

            for (int v : map.values()) {
                if (v % n != 0) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}
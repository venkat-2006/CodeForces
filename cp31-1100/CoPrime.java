import java.util.*;

public class CoPrime {//1742D
    static int gcd(int a, int b) {
        while (b != 0) {
            int x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] pos = new int[1001];
            Arrays.fill(pos, -1);

            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                pos[x] = i;
            }

            int ans = -1;

            for (int x = 1; x <= 1000; x++) {
                if (pos[x] == -1) continue;
                for (int y = 1; y <= 1000; y++) {
                    if (pos[y] == -1) continue;
                    if (gcd(x, y) == 1) ans = Math.max(ans, pos[x] + pos[y]);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

import java.util.*;

public class MakeAP { // 1624B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (canMakeAP(a, b, c)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }

    static boolean canMakeAP(long a, long b, long c) {
        long newA = 2 * b - c;
        if (newA > 0 && newA % a == 0) return true;

        if ((a + c) % 2 == 0) {
            long newB = (a + c) / 2;
            if (newB > 0 && newB % b == 0) return true;
        }

        long newC = 2 * b - a;
        if (newC > 0 && newC % c == 0) return true;

        return false;
    }
}

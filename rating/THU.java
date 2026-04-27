import java.util.*;

public class THU {//2216B

    static void solve(Scanner sc) {
        long cT = sc.nextLong();
        long cH = sc.nextLong();
        long cU = sc.nextLong();

        long totalHeight = 3L * (cT + cH + cU);
        long savings = 0;

        long pairTU = Math.min(cT, cU);
        savings += 2L * pairTU;
        cT -= pairTU;

        long pairH = Math.min(cT, 2L * cH);
        savings += pairH;
        cT -= pairH;

        if (cT > 0) {
            savings += (cT - 1);
        }

        System.out.println(totalHeight - savings);
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
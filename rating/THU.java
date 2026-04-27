import java.util.*;

public class THU {//2216B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long cT = sc.nextLong();
            long cH = sc.nextLong();
            long cU = sc.nextLong();

            long x = Math.min(cT, cU);
            cT -= x;
            cU -= x;

            long y = Math.min(cT, cH);
            cT -= y;
            cH -= y;

            long z = cT / 2;
            cT -= 2 * z;

            long remaining = cH + cU;
            long pairs = remaining / 2;

            long ans = 4 * x + 5 * y + 5 * z + 6 * pairs;

            if (remaining % 2 == 1) {
                ans += 3;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
import java.util.*;

public class PlusMinusPermutation { // 1872D

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long lcm = lcm(x, y);

            long cx = n / x;
            long cy = n / y;
            long cxy = n / lcm;

            long plusOnly = cx - cxy;
            long minusOnly = cy - cxy;

            long sumPlus = plusOnly * n - (plusOnly * (plusOnly - 1)) / 2;
            long sumMinus = (minusOnly * (minusOnly + 1)) / 2;

            System.out.println(sumPlus - sumMinus);
        }

        sc.close();
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}

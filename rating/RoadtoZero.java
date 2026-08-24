import java.util.*;

public class RoadtoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TestsNumT = sc.nextInt();

        while (TestsNumT-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans1 = (x + y) * a;

            long ans2 = Math.min(x, y) * b
                      + Math.abs(x - y) * a;

            System.out.println(Math.min(ans1, ans2));
        }
    }
}
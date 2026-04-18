import java.util.*;

public class Dungeon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long sum = a + b + c;

            long k = sum / 9;

            long min = Math.min(a, Math.min(b, c));

            if (sum % 9 == 0 && min >= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
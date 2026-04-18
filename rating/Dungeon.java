import java.util.*;

public class Dungeon {//1463A
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long sum = a + b + c;
            long max = Math.max(a, Math.max(b, c));

            if (sum % 9 == 0 && max <= sum / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
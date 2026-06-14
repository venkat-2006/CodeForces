import java.util.*;

public class ZeroArray {//1201B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            sum += x;
            max = Math.max(max, x);
        }

        sc.close();

        if (sum % 2 == 0 && 2 * max <= sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
import java.util.*;

public class SixtySeventhInteger { // 2218B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int sum = 0, max = Integer.MIN_VALUE;

            for (int i = 0; i < 7; i++) {
                int x = sc.nextInt();
                sum += x;
                if (x > max) max = x;
            }

            System.out.println(2 * max - sum);
        }
    }
}
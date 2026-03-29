import java.util.*;

public class MoveAndTurn {//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long k = n / 2;

        if (n % 2 == 0) {
            // even case
            System.out.println((k + 1) * (k + 1));
        } else {
            // odd case
            System.out.println(2 * (k + 1) * (k + 2));
        }
    }
}
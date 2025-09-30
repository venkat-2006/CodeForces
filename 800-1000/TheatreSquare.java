import java.util.*;

public class TheatreSquare { // 1A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long r1 = (a + c - 1) / c;
        long r2 = (b + c - 1) / c;

        System.out.println(r1 * r2);

        sc.close();
    }
}

import java.util.*;

public class Restoring {//1154A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] x = new long[4];
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextLong();
        }

        Arrays.sort(x);

        long a = x[3] - x[2];
        long b = x[3] - x[1];
        long c = x[3] - x[0];

        System.out.println(a + " " + b + " " + c);
    }
}

import java.util.*;

public class Omkar {//1372B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long d = n;

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    d = i;
                    break;
                }
            }

            long a = n / d;
            long b = n - a;

            System.out.println(a + " " + b);
        }
    }
}
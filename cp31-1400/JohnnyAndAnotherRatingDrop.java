import java.util.*;

public class JohnnyAndAnotherRatingDrop { // 1362C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long ans = 0;
            long pow = 1;

            while (pow <= n) {
                ans += n / pow;
                pow *= 2;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
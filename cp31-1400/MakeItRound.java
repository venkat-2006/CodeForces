import java.util.*;

public class MakeItRound {//1759D

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long m = sc.nextLong();

            long temp = n;

            int two = 0;
            int five = 0;

            while (temp % 2 == 0) {
                two++;
                temp /= 2;
            }

            while (temp % 5 == 0) {
                five++;
                temp /= 5;
            }

            long k = 1;

            while (two < five && k * 2 <= m) {
                k *= 2;
                two++;
            }

            while (five < two && k * 5 <= m) {
                k *= 5;
                five++;
            }

            while (k * 10 <= m) {
                k *= 10;
            }

            k *= (m / k);

            System.out.println(n * k);
        }

        sc.close();
    }
}
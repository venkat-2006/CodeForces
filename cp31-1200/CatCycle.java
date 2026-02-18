import java.util.Scanner;

public class CatCycle {//1487B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();

            k--;

            if (n % 2 == 0) {
                System.out.println((k % n) + 1);
            } else {
                long val = n / 2;
                System.out.println(((k + (k / val)) % n) + 1);
            }
        }

        scanner.close();
    }
}

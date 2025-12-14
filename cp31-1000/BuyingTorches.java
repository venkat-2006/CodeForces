import java.util.Scanner;

public class BuyingTorches {//1418A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long need = k * (y + 1) - 1;
            long stickTrades = (need + (x - 2)) / (x - 1);
            long result = stickTrades + k;

            System.out.println(result);
        }
        sc.close();
    }
}

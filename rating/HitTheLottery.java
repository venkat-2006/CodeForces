import java.util.Scanner;

public class HitTheLottery {//996A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        int count = 0;

        while (x > 0) {
            if (x >= 100) {
                count += x / 100;
                x = x % 100;
            } else if (x >= 20) {
                count += x / 20;
                x = x % 20;
            } else if (x >= 10) {
                count += x / 10;
                x = x % 10;
            } else if (x >= 5) {
                count += x / 5;
                x = x % 5;
            } else { // x >= 1
                count += x;
                x = 0;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

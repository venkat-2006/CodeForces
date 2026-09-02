import java.util.*;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hours = 0;

        while (a >= b) {
            hours += a;
            a = a / b + a % b;
        }

        System.out.println(hours);
    }
}
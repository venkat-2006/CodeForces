import java.util.*;

public class Drinks { // 200B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of drinks
        double total = 0.00;

        for (int i = 0; i < n; i++) {
            total += sc.nextDouble();
        }

        double res = total / n; // divide by original number
        System.out.printf("%.12f", res);

        sc.close();
    }
}

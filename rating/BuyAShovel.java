import java.util.*;

public class BuyAShovel { // 732A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        int n = 1;

        while (true) {
            int cost = k * n;

            if (cost % 10 == 0 || cost % 10 == r) {
                System.out.println(n);
                break;
            }

            n++;
        }

        sc.close();
    }
}
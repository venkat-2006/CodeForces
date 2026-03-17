import java.util.*;

public class ProductOfThreeNumbers {//1294C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int a = -1, b = -1, c = -1;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    n /= i;
                    break;
                }
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0 && i != a) {
                    b = i;
                    c = n / i;
                    break;
                }
            }

            if (a != -1 && b != -1 && c != -1 && c != a && c != b) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
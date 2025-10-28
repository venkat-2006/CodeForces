import java.util.Scanner;

public class WeNeedTheZero {//1805A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int totalXor = 0;
            for (int i = 0; i < n; i++) {
                totalXor ^= scanner.nextInt();
            }
            if (n % 2 == 1) {
                System.out.println(totalXor);
            } else {
                if (totalXor == 0) System.out.println(0);
                else System.out.println(-1);
            }
        }
        scanner.close();
    }
}

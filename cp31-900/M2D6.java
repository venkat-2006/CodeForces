import java.util.Scanner;

public class M2D6 { //1374B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int pow2 = 0, pow3 = 0;

            while (n % 2 == 0) {
                n /= 2;
                pow2++;
            }

            while (n % 3 == 0) {
                n /= 3;
                pow3++;
            }

            if (n != 1 || pow3 < pow2) {
                System.out.println(-1);
            } else {
                System.out.println((pow3 - pow2) + pow3);
            }
        }
        sc.close();
    }
}

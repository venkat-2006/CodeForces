import java.util.*;

public class MEXORmixup { // 1567B

    static int xorUpto(int n) {
        if (n < 0) return 0;
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xor0 = xorUpto(a - 1);
            int need = xor0 ^ b;

            if (need == 0) System.out.println(a);
            else if (need == a) System.out.println(a + 2);
            else System.out.println(a + 1);
        }
    }
}

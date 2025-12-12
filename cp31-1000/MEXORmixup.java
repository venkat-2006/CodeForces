import java.util.*;

public class MEXORmixup { // 1567B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xor0 = 0;
            for (int i = 0; i < a; i++) xor0 ^= i;

            int need = xor0 ^ b;

            if (need == 0) System.out.println(a);
            else if (need == a) System.out.println(a + 2);
            else System.out.println(a + 1);
        }
    }
}

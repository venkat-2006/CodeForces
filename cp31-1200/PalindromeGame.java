import java.util.*;

public class PalindromeGame {//1527B1
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int z = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') z++;
            }

            if (z == 0) {
                System.out.println("DRAW");
            } else if (z == 1) {
                System.out.println("BOB");
            } else if (z % 2 == 1) {
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
        }
        sc.close();
    }
}

import java.util.*;

public class FlipTheBits { // 1504B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        while (x-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();

            boolean[] zero = new boolean[n];
            int balance = 0;

            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == '1') balance++;
                else balance--;
                if (balance == 0) zero[i] = true;
            }

            boolean flipped = false;
            boolean possible = true;

            for (int i = n - 1; i >= 0; i--) {
                char cur = s1.charAt(i);
                if (flipped) cur = (cur == '0') ? '1' : '0';

                if (cur != s2.charAt(i)) {
                    if (!zero[i]) {
                        possible = false;
                        break;
                    }
                    flipped = !flipped;
                }
            }

            if (possible) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}

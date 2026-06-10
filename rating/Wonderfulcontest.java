import java.util.*;

public class Wonderfulcontest { // 2222A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean xx = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 100) {
                    xx= true;
                }
            }

            System.out.println(xx ? "Yes" : "No");
        }
    }
}
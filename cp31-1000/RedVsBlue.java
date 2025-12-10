import java.util.*;

public class RedVsBlue { //1659A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();

            int parts = b + 1;
            int base = r / parts;
            int extra = r % parts;

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < parts; i++) {
                int len = base + (extra > 0 ? 1 : 0);
                extra--;
                for (int k = 0; k < len; k++) sb.append('R');
                if (b > 0) {
                    sb.append('B');
                    b--;
                }
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}

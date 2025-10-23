import java.util.*;

public class CoverInWater {//1900A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int dots = 0;
            for (char c : s.toCharArray()) {
                if (c == '.') dots++;
            }

            if (dots == 0) {
                System.out.println(0);
            } else if (s.contains("...")) {
                System.out.println(2);
            } else {
                System.out.println(dots);
            }
        }
        sc.close();
    }
}

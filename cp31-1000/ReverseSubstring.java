
import java.util.*;

public class ReverseSubstring {// 1155A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                System.out.println("YES");
                System.out.println(i + " " + (i + 1));
                return;
            }
        }
        System.out.println("NO");
    }
}

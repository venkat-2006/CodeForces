import java.util.*;

public class Lucky {//1676A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < 3; i++) {
                sum1 += s.charAt(i) - '0';
                sum2 += s.charAt(i + 3) - '0';
            }

            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

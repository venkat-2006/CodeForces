import java.util.*;

public class Chewbacca { // 514A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            int digit = x.charAt(i) - '0';

            if (i == 0 && digit == 9) {
                sb.append(9);
            } else {
                int inverted = 9 - digit;
                sb.append(Math.min(digit, inverted));
            }
        }

        System.out.println(sb.toString());
    }
}
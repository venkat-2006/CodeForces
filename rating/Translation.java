import java.util.*;

public class Translation { // 41A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();

        boolean isTranslation = true;

        if (x.length() != y.length()) {
            isTranslation = false;
        } else {
            int i = 0;
            while (i < x.length()) {
                if (x.charAt(i) != y.charAt(y.length() - 1 - i)) {
                    isTranslation = false;
                    break;
                }
                i++;
            }
        }

        System.out.println(isTranslation ? "YES" : "NO");

        sc.close();
    }
}

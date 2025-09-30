import java.util.*;

public class Bit { // 282A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int total = 0;

        while (x-- > 0) {
            String s = sc.next();
            if (s.equals("++X") || s.equals("X++")) {
                total++;
            } else if (s.equals("--X") || s.equals("X--")) {
                total--;
            }
        }

        System.out.println(total);
        sc.close();
    }
}

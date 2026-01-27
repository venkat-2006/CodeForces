import java.util.*;

public class Yes {//1703A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            if (s.toLowerCase().equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

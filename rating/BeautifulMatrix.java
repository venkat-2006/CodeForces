import java.util.*;

public class BeautifulMatrix {//263A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = -1, c = -1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int x = sc.nextInt();
                if (x == 1) { r = i; c = j; }
            }
        }
        sc.close();
        System.out.println(Math.abs(r - 3) + Math.abs(c - 3));
    }
}

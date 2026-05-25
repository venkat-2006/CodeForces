import java.util.*;

public class ConstructAnArray {//2231A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(2 * i - 1 + " ");
            }

            System.out.print("\n");
        }
    }
}
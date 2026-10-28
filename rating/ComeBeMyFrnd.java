import java.util.*;

public class ComeBeMyFrnd{//2261D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int k = (n + 1) / 2;
            System.out.println(k);

            for (int i = 1; i <= k; i++) {
                System.out.println(i + " " + (i + k - 1));
            }
        }
    }
}

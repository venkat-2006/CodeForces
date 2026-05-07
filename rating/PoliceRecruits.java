import java.util.*;

public class PoliceRecruits {//427A

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int police = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            if (x == -1) {
                if (police > 0) {
                    police--;
                } else {
                    ans++;
                }
            } else {
                police += x;
            }
        }

        System.out.println(ans);
    }
}
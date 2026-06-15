import java.util.*;

public class EasternExhibiton { // 1486B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] x = new long[n];
            long[] y = new long[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
            }

            Arrays.sort(x);
            Arrays.sort(y);

            long ans;

            if (n % 2 == 1) {
                ans = 1;
            } else {
                long xChoices = x[n / 2] - x[n / 2 - 1] + 1;
                long yChoices = y[n / 2] - y[n / 2 - 1] + 1;

                ans = xChoices * yChoices;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
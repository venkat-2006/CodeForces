import java.util.*;

public class BasketBallExercise {//1195C

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] h1 = new long[n];
        long[] h2 = new long[n];

        for (int i = 0; i < n; i++) {
            h1[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            h2[i] = sc.nextLong();
        }

        long[] top = new long[n];
        long[] bottom = new long[n];

        long bestTop = 0;
        long bestBottom = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {

            top[i] = h1[i] + bestBottom;
            bottom[i] = h2[i] + bestTop;

            bestTop = Math.max(bestTop, top[i]);
            bestBottom = Math.max(bestBottom, bottom[i]);

            ans = Math.max(ans, Math.max(top[i], bottom[i]));
        }

        System.out.println(ans);
    }
}
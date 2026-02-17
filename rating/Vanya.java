import java.util.Arrays;
import java.util.Scanner;

public class Vanya {//492B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt();
        }

        Arrays.sort(lanterns);

        double maxGap = 0;
        for (int i = 0; i < n - 1; i++) {
            maxGap = Math.max(maxGap, lanterns[i + 1] - lanterns[i]);
        }

        double start = lanterns[0] - 0;
        double end = l - lanterns[n - 1];

        double d = Math.max(start, end);
        d = Math.max(d, maxGap / 2.0);

        System.out.printf("%.10f\n", d);

        sc.close();
    }
}

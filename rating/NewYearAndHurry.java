import java.util.*;

public class NewYearAndHurry {//750A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int time = 240 - k;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            sum += 5 * i;

            if (sum <= time) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
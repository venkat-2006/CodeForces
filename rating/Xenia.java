import java.util.*;

public class Xenia { // 339B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long time = 0;
        int current = 1;

        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();

            if (target >= current) {
                time += (target - current);
            } else {
                time += (n - current) + target;
            }

            current = target;
        }

        System.out.println(time);
    }
}
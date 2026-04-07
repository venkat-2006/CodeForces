import java.util.*;

public class TwoButtons { // 520B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int steps = 0;

        
        while (m > n) {
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m += 1;
            }
            steps++;
        }

        
        steps += (n - m);

        System.out.println(steps);
    }
}
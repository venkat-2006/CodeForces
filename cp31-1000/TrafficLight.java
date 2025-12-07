import java.util.*;

public class TrafficLight { //1744C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            String doubled = s + s;
            int ans = 0;

            int[] nextGreen = new int[2 * n];
            int last = -1;

            for (int i = 2 * n - 1; i >= 0; i--) {
                if (doubled.charAt(i) == 'g') {
                    last = i;
                }
                nextGreen[i] = last;
            }

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    int gPos = nextGreen[i];
                    if (gPos != -1) {
                        ans = Math.max(ans, gPos - i);
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

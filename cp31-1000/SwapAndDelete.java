import java.util.*;

public class SwapAndDelete {//1913B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            int total0 = 0, total1 = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') total0++;
                else total1++;
            }

            int zerosPref = 0, onesPref = 0;
            int maxKeep = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') zerosPref++;
                else onesPref++;

                if (onesPref <= total0 && zerosPref <= total1) {
                    maxKeep = i + 1;
                }
            }

            System.out.println(n - maxKeep);
        }

        sc.close();
    }
}

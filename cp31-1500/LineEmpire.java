import java.util.*;

public class LineEmpire {//1659C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long[] x = new long[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
                sum += x[i];
            }

            long ans = b * sum;
            long prev = 0;

            for (int i = 0; i < n; i++) {
                long future = n - 1L - i;
                if (b * future > a) {
                    long dist = x[i] - prev;
                    ans -= (b * future - a) * dist;
                    prev = x[i];
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
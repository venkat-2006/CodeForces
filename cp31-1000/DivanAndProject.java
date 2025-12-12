import java.util.*;

public class DivanAndProject {//1614B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            List<long[]> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(new long[]{a[i], i});
            }

            list.sort((x, y) -> Long.compare(y[0], x[0]));

            long[] pos = new long[n + 1];
            pos[0] = 0;

            long d = 1;
            long total = 0;
            boolean right = true;

            for (long[] p : list) {
                long v = p[0];
                int idx = (int) p[1];

                if (right) pos[idx] = d;
                else {
                    pos[idx] = -d;
                    d++;
                }

                right = !right;
                total += 2L * v * Math.abs(pos[idx]);
            }

            System.out.println(total);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= n; i++) sb.append(pos[i]).append(" ");
            System.out.println(sb.toString());
        }
    }
}

import java.util.*;

public class Virus {//1704C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            int m = sc.nextInt();

            long[] a = new long[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            ArrayList<Long> gaps = new ArrayList<>();

            for (int i = 0; i < m - 1; i++) {
                long gap = a[i + 1] - a[i] - 1;
                if (gap > 0) gaps.add(gap);
            }

            long circularGap = (n - a[m - 1]) + (a[0] - 1);
            if (circularGap > 0) gaps.add(circularGap);

            gaps.sort(Collections.reverseOrder());

            long days = 0;
            long saved = 0;

            for (long gap : gaps) {
                long effective = gap - 2 * days;

                if (effective <= 0) continue;

                if (effective == 1) {
                    saved += 1;
                    days += 1;
                } else {
                    saved += (effective - 1);
                    days += 2;
                }
            }

            System.out.println(n - saved);
        }

        sc.close();
    }
}

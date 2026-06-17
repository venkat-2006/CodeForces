import java.util.*;

public class SmiloAndMonsters {//////////1891C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            int i = 0;
            int j = n - 1;
            long sum = 0;
            long groups = 0;
            while (i <= j) {
                if (sum + a[i] <= a[j]) {
                    sum += a[i];
                    i++;
                } else {
                    groups++;
                    j--;
                }
            }
            System.out.println(groups + sum);
        }

        sc.close();
    }
}
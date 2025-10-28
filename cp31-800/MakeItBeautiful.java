import java.util.*;

public class MakeItBeautiful {//1783A
    public static void main(String[] args) {//qsn is easy,i'm just dumb ;)
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
            Arrays.sort(a);
            long max = a[n - 1], min = a[0];
            if (max == min) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.print(max + " ");
                for (int i = 0; i < n - 1; i++) System.out.print(a[i] + " ");
                System.out.println();
            }
        }
        scanner.close();
    }
}

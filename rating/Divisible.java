import java.util.*;

public class Divisible {//2188A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            boolean[] used = new boolean[n + 1];

            p[n] = 1;
            used[1] = true;

            for (int i = n - 1; i >= 1; i--) {
                int curr = p[i + 1];

                int x1 = curr + i;
                int x2 = curr - i;

                if (x1 >= 1 && x1 <= n && !used[x1]) {
                    p[i] = x1;
                    used[x1] = true;
                } else {
                    p[i] = x2;
                    used[x2] = true;
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

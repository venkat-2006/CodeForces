import java.util.*;

public class ShoeShuffling {//1691B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < n; i++) s[i] = sc.nextInt();

            boolean ok = true;
            int count = 1;

            for (int i = 1; i < n; i++) {
                if (s[i] == s[i - 1]) count++;
                else {
                    if (count == 1) ok = false;
                    count = 1;
                }
            }
            if (count == 1) ok = false;

            if (!ok) {
                System.out.println(-1);
                continue;
            }

            int[] p = new int[n];
            int i = 0;

            while (i < n) {
                int j = i;
                while (j < n && s[j] == s[i]) j++;
                for (int k = i; k < j; k++) {
                    if (k == j - 1) p[k] = i + 1;
                    else p[k] = k + 2;
                }
                i = j;
            }

            for (int k = 0; k < n; k++) System.out.print(p[k] + " ");
            System.out.println();
        }

        sc.close();
    }
}

import java.util.*;

public class GoodPairQueries {//2248D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            sc.nextLine();

            String s = sc.nextLine();
            String t = sc.nextLine();

            int p00[] = new int[n + 1];
            int p01[] = new int[n + 1];
            int p10[] = new int[n + 1];
            int p11[] = new int[n + 1];

            for (int i = 0; i < n; i++) {
                p00[i + 1] = p00[i];
                p01[i + 1] = p01[i];
                p10[i + 1] = p10[i];
                p11[i + 1] = p11[i];

                if (s.charAt(i) == '0' && t.charAt(i) == '0')
                    p00[i + 1]++;
                else if (s.charAt(i) == '0' && t.charAt(i) == '1')
                    p01[i + 1]++;
                else if (s.charAt(i) == '1' && t.charAt(i) == '0')
                    p10[i + 1]++;
                else
                    p11[i + 1]++;
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                int c00 = p00[r] - p00[l - 1];
                int c01 = p01[r] - p01[l - 1];
                int c10 = p10[r] - p10[l - 1];
                int c11 = p11[r] - p11[l - 1];

                if (Math.abs(c01 - c10) <= c00 + c11)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
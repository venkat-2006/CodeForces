import java.util.Scanner;

public class Johnny { // 1362A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            long x = a, y = b;

            while (x % 2 == 0) x /= 2;
            while (y % 2 == 0) y /= 2;

            if (x != y) {
                System.out.println(-1);
                continue;
            }

            int pa = 0, pb = 0;
            long ta = a, tb = b;

            while (ta % 2 == 0) {
                ta /= 2;
                pa++;
            }
            while (tb % 2 == 0) {
                tb /= 2;
                pb++;
            }

            int diff = Math.abs(pa - pb);
            int ans = diff / 3;
            if (diff % 3 != 0) ans++;

            System.out.println(ans);
        }
        sc.close();
    }
}

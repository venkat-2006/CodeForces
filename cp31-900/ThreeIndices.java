import java.util.Scanner;

public class ThreeIndices { //1380A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            int i = -1, j = -1, k = -1;

            for (int x = 1; x < n - 1; x++) {
                if (p[x] > p[x - 1] && p[x] > p[x + 1]) {
                    i = x - 1;
                    j = x;
                    k = x + 1;
                    break;
                }
            }

            if (i != -1) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

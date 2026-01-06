import java.util.*;

public class Dejavu {//1891B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int minX = 31;

            for (int i = 0; i < q; i++) {
                int x = sc.nextInt();

                if (x < minX) {
                    int pow = (int) Math.pow(2, x);
                    int add = (int) Math.pow(2, x - 1);

                    for (int j = 0; j < n; j++) {
                        if (a[j] % pow == 0) {
                            a[j] += add;
                        }
                    }
                    minX = x;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

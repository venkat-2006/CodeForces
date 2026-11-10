import java.util.Scanner;

public class MakeItGood {//1385C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            int i = n - 1;
            while (i > 0 && a[i - 1] >= a[i]) {
                i--;
            }
            while (i > 0 && a[i - 1] <= a[i]) {
                i--;
            }

            System.out.println(i);
        }
        sc.close();
    }
}

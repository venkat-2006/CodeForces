import java.util.*;

public class BallInBerland { // 1475C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[k];
            int brr[] = new int[k];

            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < k; i++) {
                brr[i] = sc.nextInt();
            }

            long boys[] = new long[a + 1];
            long girls[] = new long[b + 1];

            for (int i = 0; i < k; i++) {
                boys[arr[i]]++;
                girls[brr[i]]++;
            }

            long ans = 0;

            for (int i = 0; i < k; i++) {
                ans += k - boys[arr[i]] - girls[brr[i]] + 1;
            }

            System.out.println(ans / 2);
        }

        sc.close();
    }
}
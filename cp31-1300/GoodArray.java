import java.util.*;

public class GoodArray { //  1077C

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        long max1 = 0, max2 = 0;

        for (long x : a) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
        }

        long target = (sum - max1) - max1;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (a[i] == max1) {

                if (sum - max1 == 2 * max2) {
                    ans.add(i + 1);
                }

            } else {

                if (a[i] == target) {
                    ans.add(i + 1);
                }

            }
        }

        System.out.println(ans.size());

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
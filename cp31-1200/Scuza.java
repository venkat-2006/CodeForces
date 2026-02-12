import java.util.*;

public class Scuza { //1742E
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x-- > 0) {

            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long[] prefSum = new long[n];
            int[] prefMax = new int[n];

            prefSum[0] = a[0];
            prefMax[0] = a[0];

            for (int i = 1; i < n; i++) {
                prefSum[i] = prefSum[i - 1] + a[i];
                prefMax[i] = Math.max(prefMax[i - 1], a[i]);
            }

            for (int i = 0; i < q; i++) {
                int k = sc.nextInt();

                int idx = upperBound(prefMax, k);

                if (idx == 0) System.out.print(0 + " ");
                else System.out.print(prefSum[idx - 1] + " ");
            }

            System.out.println();
        }

        sc.close();
    }

    static int upperBound(int[] arr, int k) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = (l + r) / 2;

            if (arr[mid] <= k) l = mid + 1;
            else r = mid;
        }

        return l;
    }
}

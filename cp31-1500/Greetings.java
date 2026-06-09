import java.util.*;

public class Greetings {//1915F

    static long ans;

    static void mergeSort(long[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    static void merge(long[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        long[] left = new long[n1];
        long[] right = new long[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                ans += (n1 - i);
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[][] people = new long[n][2];

            for (int i = 0; i < n; i++) {
                people[i][0] = sc.nextLong(); 
                people[i][1] = sc.nextLong(); 
            }

            Arrays.sort(people, (x, y) -> Long.compare(x[0], y[0]));

            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                b[i] = people[i][1];
            }

            ans = 0;
            mergeSort(b, 0, n - 1);

            System.out.println(ans);
        }

        sc.close();
    }
}
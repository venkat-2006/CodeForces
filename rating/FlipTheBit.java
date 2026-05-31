import java.util.*;

public class FlipTheBit {//2217B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n + 2];

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            int pivot = sc.nextInt();

            arr[0] = arr[pivot];
            arr[n + 1] = arr[pivot];

            int countL = 0;
            int countR = 0;

            for (int i = 0; i < pivot; i++) {
                if (arr[i] != arr[i + 1]) {
                    countL++;
                }
            }

            for (int i = pivot; i < n + 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    countR++;
                }
            }

            System.out.println(Math.max(countL, countR));
        }

        sc.close();
    }
}
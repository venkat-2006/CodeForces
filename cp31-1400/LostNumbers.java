import java.util.*;

public class LostNumbers { // 1167B

    static int[] nums = {4, 8, 15, 16, 23, 42};
    static boolean found = false;

    static void permute(int idx, int[] arr,
                        int p12, int p23, int p34, int p45) {

        if (found) return;

        if (idx == arr.length) {

            if (arr[0] * arr[1] == p12 &&
                arr[1] * arr[2] == p23 &&
                arr[2] * arr[3] == p34 &&
                arr[3] * arr[4] == p45) {

                for (int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();

                found = true;
            }
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            permute(idx + 1, arr, p12, p23, p34, p45);
            swap(arr, idx, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p12 = sc.nextInt();
        int p23 = sc.nextInt();
        int p34 = sc.nextInt();
        int p45 = sc.nextInt();

        int[] arr = nums.clone();

        permute(0, arr, p12, p23, p34, p45);
    }
}
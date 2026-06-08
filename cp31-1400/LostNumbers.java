import java.util.*;

public class LostNumbers {//1167B

    static int[] p = {4, 8, 15, 16, 23, 42};
    static int[] ans = new int[4];

    static boolean nextPermutation(int[] arr) {
        int n = arr.length;

        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        if (i < 0) return false;

        int j = n - 1;
        while (arr[j] <= arr[i]) j--;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int l = i + 1, r = n - 1;
        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("? " + (i + 1) + " " + (i + 2));
            System.out.flush();
            ans[i] = sc.nextInt();
        }

        do {
            boolean good = true;

            for (int i = 0; i < 4; i++) {
                if (p[i] * p[i + 1] != ans[i]) {
                    good = false;
                    break;
                }
            }

            if (good) break;

        } while (nextPermutation(p));

        System.out.print("!");
        for (int x : p) {
            System.out.print(" " + x);
        }
        System.out.println();
        System.out.flush();
    }
}
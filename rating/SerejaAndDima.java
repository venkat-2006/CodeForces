import java.util.*;

public class SerejaAndDima {//381A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        int sereja = 0, dima = 0;
        boolean turn = true; 

        while (left <= right) {
            int picked;

            if (arr[left] > arr[right]) {
                picked = arr[left];
                left++;
            } else {
                picked = arr[right];
                right--;
            }

            if (turn) {
                sereja += picked;
            } else {
                dima += picked;
            }

            turn = !turn;
        }

        System.out.println(sereja + " " + dima);
    }
}
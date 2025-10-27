import java.util.*;
public class TwinPermutations { // 1831A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int min = 1;
            int max = n;

            for (int i = 0; i < n; i++) {
                System.out.print((min + max - arr[i]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

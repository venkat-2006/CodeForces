import java.util.Scanner;

public class YarikAndArray { // 1899C kadane modification 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            
            long currentSum = arr[0];
            long maxSum = arr[0];

            for (int i = 1; i < n; i++) {

                
                if ((arr[i] % 2) != (arr[i - 1] % 2)) {
                    currentSum = Math.max(arr[i], currentSum + arr[i]);
                } else {
                    currentSum = arr[i];
                }

                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println(maxSum);
        }

        sc.close();
    }
}

import java.util.*;

public class Fence { // 363B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

      
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += h[i];
        }

        int minSum = sum;
        int answerIndex = 0;

        
        for (int i = k; i < n; i++) {
            sum = sum - h[i - k] + h[i];

            if (sum < minSum) {
                minSum = sum;
                answerIndex = i - k + 1;
            }
        }

        System.out.println(answerIndex + 1);

        sc.close();
    }
}
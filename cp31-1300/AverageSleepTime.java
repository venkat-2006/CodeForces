import java.util.*;

public class AverageSleepTime { // 808B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long windowSum = 0;

        
        for (int i = 0; i < k; i++) {
            windowSum += a[i];
        }

        double total = windowSum;

       
        for (int i = k; i < n; i++) {
            windowSum += a[i];
            windowSum -= a[i - k];
            total += windowSum;
        }

        double weeks = n - k + 1;

        System.out.printf("%.10f\n", total / weeks);
    }
}
import java.util.*;

public class BinaryDeque {//1692E
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int[] arr = new int[n];
            int total = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            
            int target = total - x;
            
            if (target < 0) {
                System.out.println(-1);
                continue;
            }
            
            if (target == 0) {
                System.out.println(n);
                continue;
            }
            
            int i = 0, sum = 0, maxLen = -1;
            
            for (int j = 0; j < n; j++) {
                sum += arr[j];
                
                while (sum > target) {
                    sum -= arr[i];
                    i++;
                }
                
                if (sum == target) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
            
            if (maxLen == -1) {
                System.out.println(-1);
            } else {
                System.out.println(n - maxLen);
            }
        }
        sc.close();
    }
}
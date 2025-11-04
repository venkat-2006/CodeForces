import java.util.*;

public class NotDivisibleArray {//1794B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == 1) a[i]++;          
                if (a[i + 1] % a[i] == 0) a[i + 1]++;  
            }
            
            if (a[n - 1] == 1) a[n - 1]++;  
            
            for (long num : a) System.out.print(num + " ");
            System.out.println();
        }
        
        sc.close();
    }
}

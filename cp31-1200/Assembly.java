import java.util.*;

public class Assembly {//1857C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = n * (n - 1) / 2;
            
            long[] b = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextLong();
            }
            
            Arrays.sort(b);
            
            long[] a = new long[n];
            int index = 0;
            
            for (int i = 0; i < n - 1; i++) {
                a[i] = b[index];
                index += (n - 1 - i);
            }
            
            a[n - 1] = (long)1e9;
            
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
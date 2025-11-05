import java.util.*;

public class NIT { // 1696B 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int count = 0;
            int i = 0;
            while (i < n) {
                if (a[i] != 0) {
                    count++;
                    
                    while (i < n && a[i] != 0) i++;
                } else {
                    i++;
                }
            }

            if (count == 0) System.out.println(0);
            else if (count == 1) System.out.println(1);
            else System.out.println(2);
        }

        sc.close();
    }
}

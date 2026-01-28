import java.util.*;

public class ANDSorting {//1682B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            int ans = -1; 

            for (int i = 0; i < n; i++) {
                if (p[i] != i) {  
                    if (ans == -1) {
                        ans = p[i];
                    } else {
                        ans &= p[i];
                    }
                }
            }

            System.out.println(ans);
        }
    }
}

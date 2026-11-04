import java.util.Scanner;

public class SeqDeq{//2277B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int mn = n;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                mn = Math.min(mn, a);
            }
            
            if (mn < n) {
                System.out.println(n);
            } else {
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}

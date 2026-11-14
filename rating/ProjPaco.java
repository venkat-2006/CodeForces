import java.util.Scanner;

public class ProjPaco{//2274A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                long p = 0;
                
                for (int i = 0; i < n; i++) {
                    long a = sc.nextLong();
                    if (i % 2 == 0) {
                        p += a;
                    } else {
                        p -= a;
                    }
                }
                
                System.out.println(p);
            }
        }
        
        sc.close();
    }
}

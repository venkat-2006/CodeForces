import java.util.*;

public class DontTryToCount {
    public static void main(String[] args) {//1881A
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a1 = sc.next();
            String b1 = sc.next();
            
            boolean found = false;
            int count = 0;
            
           
            for (int i = 0; i <= 10; i++) {
                if (a1.contains(b1)) {
                    found = true;
                    break;
                }
                a1 = a1 + a1;
                count++;
            }
            
            if (found) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}

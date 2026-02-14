import java.util.*;

public class BinaryArrayGame { // 2183A
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            boolean hasZero = false;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    hasZero = true;
                }
            }
            
            if (hasZero) {
                System.out.println("Alice");
            } else {
                if (n % 2 == 1) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            }
        }
        
        sc.close();
    }
}

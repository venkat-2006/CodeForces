import java.util.Scanner;

public class Convenience{//2275A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int r = sc.nextInt();
            
            // Move R units along the x-axis
            int x = x0 + r;
            int y = y0;
            
            System.out.println(x + " " + y);
        }
        
        sc.close();
    }
}

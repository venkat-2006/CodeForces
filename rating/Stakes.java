import java.util.Scanner;

public class Staked{//2278B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int n = x + y + z;
            char c = (x >= y) ? 'P' : (y >= z ? 'R' : 'S');
            
            System.out.println(String.valueOf(c).repeat(n));
        }
        sc.close();
    }
}

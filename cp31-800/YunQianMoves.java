import java.util.*;
public class YunQianMoves {//1806A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if (d < b) {
                System.out.println(-1);
                continue;
            }
            long u = d - b;               
            long l = a + u - c;          
            if (l < 0) {
                System.out.println(-1);
            } else {
                System.out.println(u + l); 
            }
        }
        sc.close();
    }
}

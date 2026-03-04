import java.util.*;

public class Shuffle {//1366B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 
        while (t-- > 0) {

            long n = sc.nextLong();
            long x = sc.nextLong();
            int m = sc.nextInt();

            long L = x;
            long R = x;

            for(int i = 0; i < m; i++){
                long l = sc.nextLong();
                long r = sc.nextLong();

                if(r >= L && l <= R){
                    L = Math.min(L, l);
                    R = Math.max(R, r);
                }
            }

            System.out.println(R - L + 1);
        }

        sc.close();
    }
}
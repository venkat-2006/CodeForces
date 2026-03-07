import java.util.*;

public class Snowflakes {//1846E1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            boolean ok = false;

            for(long k = 2; k * k <= n; k++){
                long sum = 1 + k;
                long term = k * k;

                while(sum + term <= n){
                    sum += term;
                    if(sum == n){
                        ok = true;
                        break;
                    }
                    term *= k;
                }

                if(ok) break;
            }

            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
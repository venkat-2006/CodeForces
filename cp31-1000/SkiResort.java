import java.util.Scanner;

public class SkiResort { // 1840C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextInt();
            long k = sc.nextInt();
            long q = sc.nextInt();

            long count = 0, ways = 0;

            for(int i = 0; i < n; i++){
                long temp = sc.nextLong();
                if(temp <= q){
                    count++;
                } else {
                    if(count >= k){
                        long diff = count - k + 1;
                        ways += diff * (diff + 1) / 2;
                    }
                    count = 0;
                }
            }

            if(count >= k){
                long diff = count - k + 1;
                ways += diff * (diff + 1) / 2;
            }

            System.out.println(ways);
        }

        sc.close();
    }
}

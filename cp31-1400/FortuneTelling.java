import java.util.*;

public class FortuneTelling {//1634B
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long parity = x % 2;

            for(int i = 0; i < n; i++){
                parity ^= (sc.nextLong() % 2);
            }

            if(parity == y % 2){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
        }

        sc.close();
    }
}
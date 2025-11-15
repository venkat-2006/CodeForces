import java.util.Scanner;

public class ExcitingBets { //1543A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();   
        
        while (x-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
               
                System.out.println("0 0");
                continue;
            }

            long d = Math.abs(a - b);   
            long rem = a % d;           

            long moves = Math.min(rem, d - rem);

            System.out.println(d + " " + moves);
        }
        sc.close();
    }
}  
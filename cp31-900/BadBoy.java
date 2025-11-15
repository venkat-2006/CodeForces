import java.util.Scanner;

public class BadBoy { //1537B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        while (x-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long i = sc.nextLong();
            long j = sc.nextLong();

            System.out.println(1 + " " + 1 + " " + n + " " + m);
        }
        
        sc.close();
    }
}

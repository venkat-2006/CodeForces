import java.util.Scanner;
public class Popcount {//2240A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong(), b = 0, p = 1;
            while(n >= k * p) {
                n -= k * p;
                p *= 2;
                b++;
            }
            System.out.println(k * b + n / p);
        }
        sc.close();
    }
}
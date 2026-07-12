import java.util.*;

public class GoodTimes {//2241B
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t--> 0) {
            long x= sc.nextLong();
            long temp= x;
            long y= 1;
            while(temp> 0) {
                y *= 10;
                temp /= 10;
            }
            System.out.println(y + 1);
        }
        sc.close();
    }
}
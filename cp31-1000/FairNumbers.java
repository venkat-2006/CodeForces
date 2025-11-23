import java.util.*;

public class FairNumbers {//1411B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(findFair(n));
        }
    }

    static long findFair(long x) {
        while (true) {
            if (isFair(x)) return x;
            x++;
        }
    }

    static boolean isFair(long x) {
        long temp = x;
        while (temp > 0) {
            int d = (int)(temp % 10);
            if (d != 0 && x % d != 0) 
                return false;
            temp /= 10;
        }
        return true;
    }
}

import java.util.*;

public class CalculatingFunction {//486A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long res;
        if (x % 2 == 0) {
            res = x / 2;
        } else {
            res = -((x + 1) / 2);
        }
        System.out.println(res);
        sc.close();
    }
    
}

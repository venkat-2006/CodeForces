import java.util.*;

public class AmbitiousKid { // 1866A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            min = Math.min(min, Math.abs(x));
        }
        
        System.out.println(min);
        sc.close();
    }
}

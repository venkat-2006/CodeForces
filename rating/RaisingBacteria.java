import java.util.*;

public class RaisingBacteria { //579A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int count = 0;

        while (x > 0) {
            count += (x & 1);
            x >>= 1;
        }

        System.out.println(count);
    }
}
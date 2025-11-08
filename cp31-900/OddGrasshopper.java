import java.util.*;

public class OddGrasshopper { // 1607B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            long x = sc.nextLong(); 
            long n = sc.nextLong(); 

            long mod = n % 4;

            if (x % 2 == 0) {
                if (mod == 1) x -= n;
                else if (mod == 2) x += 1;
                else if (mod == 3) x += (n + 1);
            } else {
                if (mod == 1) x += n;
                else if (mod == 2) x -= 1;
                else if (mod == 3) x -= (n + 1);
            }

            System.out.println(x);
        }
        sc.close();
    }
}

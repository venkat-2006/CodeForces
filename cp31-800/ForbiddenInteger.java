
import java.util.*;
public class ForbiddenInteger {//1845A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
 
            List<Integer> result = new ArrayList<>();
            boolean ok = true;
 
            if (x != 1) {
                // Case 1: 1 allowed
                for (int i = 0; i < n; i++) result.add(1);
            } else {
                // Case 2: 1 forbidden
                if (k == 1) ok = false;
                else if (k == 2 && n % 2 == 1) ok = false;
                else {
                    if (n % 2 == 0) {
                        for (int i = 0; i < n / 2; i++) result.add(2);
                    } else {
                        result.add(3);
                        for (int i = 0; i < (n - 3) / 2; i++) result.add(2);
                    }
                }
            }
 
            if (!ok) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(result.size());
                for (int num : result) System.out.print(num + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
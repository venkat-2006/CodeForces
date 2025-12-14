import java.util.*;

public class Valerii { // 1438B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            boolean duplicate = false;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (set.contains(val)) {
                    duplicate = true;
                }
                set.add(val);
            }

            if (duplicate)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

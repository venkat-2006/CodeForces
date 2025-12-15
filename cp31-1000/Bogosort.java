import java.util.*;

public class Bogosort { // 1312B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            
            Arrays.sort(a, Collections.reverseOrder());

            
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

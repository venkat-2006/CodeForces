import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {//1859A
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long maxVal = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] > maxVal) maxVal = a[i]; 
            }

            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i] == maxVal) c.add(a[i]);
                else b.add(a[i]);
            }

            if (b.isEmpty() || c.isEmpty()) {
                System.out.println(-1); 
            } else {
                System.out.println(b.size() + " " + c.size());
                for (long num : b) System.out.print(num + " ");
                System.out.println();
                for (long num : c) System.out.print(num + " ");
                System.out.println();
            }
        }

        sc.close();
    }
}

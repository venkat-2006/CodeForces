import java.util.*;

public class Monsters {  //1849B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long k = sc.nextLong();

           
            List<long[]> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long h = sc.nextLong();

                long rem = h % k;     
                if (rem == 0) rem = k; 

                list.add(new long[]{rem, i + 1});
            }

            
            list.sort((a, b) -> {
                if (a[0] != b[0]) return Long.compare(b[0], a[0]);
                return Long.compare(a[1], b[1]);
            });

            for (long[] p : list) {
                System.out.print(p[1] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

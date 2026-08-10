import java.util.*;

public class ThreeNum { // 2256A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long[] arr = {a, b, c};
            Arrays.sort(arr);

            long x = arr[0];
            long y = arr[1];
            long z = arr[2];

            System.out.println(Math.min(z - x, y));
        }

        sc.close();
    }
}
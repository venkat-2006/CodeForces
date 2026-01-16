import java.util.*;

public class Teleporters {//1791G1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                arr[i] = a + (i + 1);
            }

            Arrays.sort(arr);

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] <= c) {
                    c -= arr[i];
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}

import java.util.*;

public class OneAndTwo {//1788A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int totalTwos = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 2) totalTwos++;
            }

            if (totalTwos % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            int half = totalTwos / 2, count = 0, result = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == 2) count++;
                if (count == half) {
                    result = i + 1;
                    break;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}

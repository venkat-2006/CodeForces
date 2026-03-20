import java.util.*;

public class BalancedTunnel{//1237B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        int[] pos = new int[n + 1];

        for (int i = 0; i < n; i++) {
            pos[a[i]] = i;
        }

        int maxSeen = -1;
        int fined = 0;

        for (int i = 0; i < n; i++) {
            int curr = pos[b[i]];
            if (curr < maxSeen) fined++;
            else maxSeen = curr;
        }

        System.out.println(fined);

        sc.close();
    }
}
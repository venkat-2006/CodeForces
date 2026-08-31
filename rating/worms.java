import java.util.*;

public class worms {//474B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pre = new int[n];

        pre[0] = sc.nextInt();
        for(int i = 1; i < n; i++)
            pre[i] = pre[i - 1] + sc.nextInt();

        int m = sc.nextInt();

        while(m-- > 0) {
            int q = sc.nextInt();
            int l = 0, r = n - 1;

            while(l < r) {
                int mid = (l + r) / 2;
                if(pre[mid] >= q) r = mid;
                else l = mid + 1;
            }

            System.out.println(l + 1);
        }
    }
}
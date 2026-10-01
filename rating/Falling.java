import java.util.*;

public class Falling {//2266D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long[] b = new long[n];

            for(int i = 0; i < n; i++) {
                long x = sc.nextLong();
                b[i] = x - (i + 1);
            }

            Arrays.sort(b);

            int ans = 1;
            int curr = 1;
            int ballast = 0;

            for(int i = 1; i < n; i++) {
                if(b[i] == b[i - 1])
                    continue;

                if(b[i] == b[i - 1] + 1)
                    curr++;
                else
                    curr = 1;

                ans = Math.max(ans, curr);
            }

            System.out.println(ans);
        }
    }
}

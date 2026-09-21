import java.util.*; 
 
public class MaximizeTheScore { //2248C
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int T = sc.nextInt(); 
 
        while (T-- > 0) { 
            int n = sc.nextInt(); 
            int[] first = new int[n + 1]; 
            Arrays.fill(first, -1); 
 
            long[] dp = new long[2 * n + 1]; 
 
            for (int i = 1; i <= 2 * n; i++) { 
                int x = sc.nextInt(); 
 
                // Take x alone 
                dp[i] = dp[i - 1] + 1; 
 
                if (first[x] == -1) { 
                    first[x] = i; 
                } else { 
                    // Take the whole segment from first x to current x 
                    long len = i - first[x] + 1; 
                    dp[i] = Math.max(dp[i], 
                            dp[first[x] - 1] + len * len); 
                } 
            } 
 
            System.out.println(dp[2 * n]); 
        } 
    } 
}

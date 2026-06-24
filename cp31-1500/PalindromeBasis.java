import java.util.*;
public class PalindromeBasis {//1673C
    static final int MAX = 40000;
    static final int MOD = 1000000007;
    static ArrayList<Integer> pals = new ArrayList<>();
    static long[] dp = new long[MAX + 1];

    static boolean isPal(int x){
        String s = Integer.toString(x);
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    static void precompute(){
        for(int i = 1; i <= MAX; i++){
            if(isPal(i)) pals.add(i);
        }
        dp[0] = 1;
        for(int p : pals){
            for(int sum = p; sum <= MAX; sum++){
                dp[sum] = (dp[sum] + dp[sum - p]) % MOD;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        precompute();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
        sc.close();
    }
}
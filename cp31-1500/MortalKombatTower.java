// Write your solution here
import java.util.*;

public class MortalKombatTower{//1418C
    static int n;
    static int[] a;
    static int[][] dp;

    static int solve(int i,int turn){
        if(i>=n)return 0;
        if(dp[i][turn]!=-1)return dp[i][turn];

        if(turn==0){
            int ans=a[i]+solve(i+1,1);
            if(i+1<n)ans=Math.min(ans,a[i]+a[i+1]+solve(i+2,1));
            return dp[i][turn]=ans;
        }else{
            int ans=solve(i+1,0);
            if(i+1<n)ans=Math.min(ans,solve(i+2,0));
            return dp[i][turn]=ans;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            a=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            dp=new int[n][2];
            for(int[] r:dp)Arrays.fill(r,-1);
            System.out.println(solve(0,0));
        }
    }
}
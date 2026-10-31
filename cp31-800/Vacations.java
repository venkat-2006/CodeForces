import java.util.*;
public class Vacations{//698A
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int INF=1000000;
        int dp[][]=new int[n+1][3];
        dp[0][0]=0;
        dp[0][1]=INF;
        dp[0][2]=INF;
        for(int i=1;i<=n;i++){
            dp[i][0]=Math.min(dp[i-1][0],Math.min(dp[i-1][1],dp[i-1][2]))+1;
            dp[i][1]=INF;
            if(arr[i-1]==1||arr[i-1]==3)
                dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=INF;
            if(arr[i-1]==2||arr[i-1]==3)
                dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1]);
        }
        int ans=Math.min(dp[n][0],Math.min(dp[n][1],dp[n][2]));
        System.out.println(ans);
        sc.close();
    }
}

import java.util.*;

public class PlanarReflections{
    static final int MOD=1000000007;

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[][][] dp=new int[n+1][k+1][2];

            for(int i=1;i<=n;i++)
                dp[i][1][0]=dp[i][1][1]=1;

            for(int j=2;j<=k;j++){
                for(int i=n;i>=1;i--){
                    long ans=2;

                    if(i<n)
                        ans+=dp[i+1][j][1]-1;

                    if(i>1)
                        ans+=dp[i-1][j-1][0]-1;

                    dp[i][j][1]=(int)((ans%MOD+MOD)%MOD);
                }

                for(int i=1;i<=n;i++){
                    long ans=2;

                    if(i>1)
                        ans+=dp[i-1][j][0]-1;

                    if(i<n)
                        ans+=dp[i+1][j-1][1]-1;

                    dp[i][j][0]=(int)((ans%MOD+MOD)%MOD);
                }
            }

            System.out.println(dp[1][k][1]);
        }
    }
}

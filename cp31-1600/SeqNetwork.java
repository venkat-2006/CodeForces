import java.util.*;
public class SeqNetwork{//1741E
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
           int n=sc.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
           }
           boolean dp[]=new boolean[n+1];
           dp[0]=true;
           for(int i=0;i<n;i++){
               int x=a[i];
               if(dp[i] && x<=n-i-1)
                   dp[i+x+1]=true;
               if(x<=i && dp[i-x])
                   dp[i+1]=true;
           }
           System.out.println(dp[n]?"YES":"NO");
       }
       sc.close();
   }
}

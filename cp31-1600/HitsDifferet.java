// import java.util.*;

// public class HitsDifferent{//1829G
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int MAX=1415;
//         long[][] dp=new long[MAX][MAX];
//         int num=1;

//         for(int r=1;r<MAX;r++){
//             for(int c=1;c<=r;c++){
//                 long sq=(long)num*num;
//                 if(r==1) dp[r][c]=sq;
//                 else if(c==1) dp[r][c]=sq+dp[r-1][c];
//                 else if(c==r) dp[r][c]=sq+dp[r-1][c-1];
//                 else dp[r][c]=sq+dp[r-1][c-1]+dp[r-1][c]-dp[r-2][c-1];
//                 num++;
//             }
//         }

//         int t=sc.nextInt();
//         while(t-->0){
//             int n=sc.nextInt(),r=1;
//             while(r*(r+1)/2<n) r++;
//             int start=(r-1)*r/2+1;
//             int c=n-start+1;
//             System.out.println(dp[r][c]);
//         }
//     }
// }
import java.util.*;

public class HitsDifferent{//1829G
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int MAX=1000000;
        long[] dp=new long[MAX+1];
        int num=1;

        // Build DP row by row
        for(int r=1;num<=MAX;r++){
            for(int c=1;c<=r && num<=MAX;c++){
                long sq=(long)num*num;

                if(r==1)
                    dp[num]=sq;
                else if(c==1)
                    dp[num]=sq+dp[num-r+1]; // Left edge
                else if(c==r)
                    dp[num]=sq+dp[num-r]; // Right edge
                else
                    dp[num]=sq+dp[num-r]+dp[num-r+1]
                           -dp[num-2*r+2]; // Remove overlap

                num++;
            }
        }

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}

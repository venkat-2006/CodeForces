import java.util.*;

public class MinusTwo{//2259B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] cnt=new int[4];

            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                cnt[x%4]++;
            }

            int ans=Math.max(cnt[0],Math.max(cnt[2],cnt[1]+cnt[3]));
            System.out.println(ans);
        }
    }
}
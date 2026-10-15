import java.util.*;
public class Prefix{//2274B
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long L=0,H=0,ans=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long a=sc.nextLong();
                ans=Math.max(ans,Math.max(a+H,a-L));
                long l=Math.min(a,a+2*L),h=Math.max(a,a+2*H);
                L=l;
                H=h;
            }
            System.out.println(ans);
        }
    }
}

import java.util.*;
public class TestGenerator{//2203C
    static boolean check(long s,long m,long n){
        long f=0;
        for(int i=59;i>=0;i--){
            f=f*2+((s>>i)&1L);
            if(((m>>i)&1L)!=0) f-=Math.min(n,f);
        }
        return f==0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long s=sc.nextLong(),m=sc.nextLong();
            if(!check(s,m,1L<<60)){
                System.out.println(-1);
                continue;
            }
            long l=1,r=1L<<60;
            while(l<r){
                long mid=l+(r-l)/2;
                if(check(s,m,mid)) r=mid;
                else l=mid+1;
            }
            System.out.println(l);
        }
        sc.close();
    }
}

import java.util.*;

public class TrackingSegments {//1843E

    static int n,m,q;
    static int[][] seg;
    static int[] query;

    static boolean check(int x){
        int[] a=new int[n+1];

        for(int i=0;i<x;i++)
            a[query[i]]=1;

        int[] pre=new int[n+1];

        for(int i=1;i<=n;i++)
            pre[i]=pre[i-1]+a[i];

        for(int i=0;i<m;i++){
            int l=seg[i][0];
            int r=seg[i][1];

            int ones=pre[r]-pre[l-1];
            int len=r-l+1;

            if(ones>len-ones)
                return true;
        }

        return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            n=sc.nextInt();
            m=sc.nextInt();

            seg=new int[m][2];

            for(int i=0;i<m;i++){
                seg[i][0]=sc.nextInt();
                seg[i][1]=sc.nextInt();
            }

            q=sc.nextInt();
            query=new int[q];

            for(int i=0;i<q;i++)
                query[i]=sc.nextInt();

            int l=1,r=q,ans=-1;

            while(l<=r){
                int mid=(l+r)/2;

                if(check(mid)){
                    ans=mid;
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
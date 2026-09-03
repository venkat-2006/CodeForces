import java.util.*;

public class ToBecomeMax {//1856C
    static boolean good(int[] a,long k,long target){
        int n=a.length;

        for(int i=0;i<n;i++){
            long need=target;
            long used=0;

            for(int j=i;j<n;j++){
                if(need<=a[j])
                    break;

                if(j==n-1){
                    used=k+1;
                    break;
                }

                used+=need-a[j];
                if(used>k)
                    break;

                need--;
            }

            if(used<=k)
                return true;
        }

        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            int[] a=new int[n];

            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            long lo=0;
            long hi=0;

            for(int x:a)
                hi=Math.max(hi,x);

            hi+=k;

            long ans=0;

            while(lo<=hi){
                long mid=(lo+hi)/2;

                if(good(a,k,mid)){
                    ans=mid;
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
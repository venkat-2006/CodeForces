import java.util.*;

public class Keshi {//1610C
    static boolean canInvite(int a[],int b[],int k){
        int cnt=0;

        for(int i=0;i<a.length;i++){
            if(b[i]>=cnt && a[i]>=k-cnt-1){
                cnt++;
            }

            if(cnt==k) return true;
        }

        return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int a[]=new int[n];
            int b[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=sc.nextInt();
            }

            int lo=1,hi=n,ans=0;

            while(lo<=hi){
                int mid=(lo+hi)/2;

                if(canInvite(a,b,mid)){
                    ans=mid;
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }

            System.out.println(ans);
        }
    }
}
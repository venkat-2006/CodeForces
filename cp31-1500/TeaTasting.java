import java.util.*;
public class TeaTasting {//1795C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            long b[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextLong();
            }

            long pref[]=new long[n+1];
            for(int i=0;i<n;i++){
                pref[i+1]=pref[i]+b[i];
            }

            long cnt[]=new long[n+1];
            long extra[]=new long[n];

            for(int i=0;i<n;i++){

                long target=pref[i]+a[i];

                int l=i;
                int r=n-1;
                int pos=i-1;

                while(l<=r){
                    int mid=l+(r-l)/2;

                    if(pref[mid+1]<=target){
                        pos=mid;
                        l=mid+1;
                    }
                    else{
                        r=mid-1;
                    }
                }

                cnt[i]++;
                cnt[pos+1]--;

                if(pos+1<n){
                    extra[pos+1]+=target-pref[pos+1];
                }
            }

            long active=0;

            for(int i=0;i<n;i++){
                active+=cnt[i];
                System.out.print(active*b[i]+extra[i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
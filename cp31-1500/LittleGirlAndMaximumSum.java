import java.util.*;

public class LittleGirlAndMaximumSum {//276C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int q=sc.nextInt();

        long a[]=new long[n+1];
        for(int i=1;i<=n;i++)
            a[i]=sc.nextInt();

        long diff[]=new long[n+2];

        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            diff[l]++;
            diff[r+1]--;
        }

        long freq[]=new long[n];
        long cur=0;
        for(int i=1;i<=n;i++){
            cur+=diff[i];
            freq[i-1]=cur;
        }

        long arr[]=new long[n];
        for(int i=1;i<=n;i++)
            arr[i-1]=a[i];

        Arrays.sort(arr);
        Arrays.sort(freq);

        long ans=0;
        for(int i=0;i<n;i++)
            ans+=arr[i]*freq[i];

        System.out.println(ans);
        sc.close();
    }
}
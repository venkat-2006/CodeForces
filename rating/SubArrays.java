import java.util.*;
public class SUbArrays{//2276C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int[] pref=new int[n+1];
            for(int i=0;i<n;i++)
                pref[i+1]=(int)((pref[i]+(long)a[i])%k);
            long[] freq=new long[k];
            long ans=0;
            for(int r=k+1;r<=n;r++){
                freq[pref[r-k-1]]++;
                ans+=freq[pref[r]];
            }
            System.out.println(ans);
        }
    }
}

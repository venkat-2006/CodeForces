import java.util.*;

public class PartitioningArray {

    static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();

            int ans=0;

            for(int k=1;k<=n;k++){
                if(n%k!=0) continue;

                int g=0;

                for(int c=0;c<k;c++){
                    int x=arr[c];
                    for(int i=c;i<n;i+=k)
                        g=gcd(g,Math.abs(arr[i]-x));
                }

                if(g!=1) ans++;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
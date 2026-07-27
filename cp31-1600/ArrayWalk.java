import java.util.*;

public class ArrayWalk{//1389B
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int z=sc.nextInt();

            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            int ans=0;

            for(int t=0;t<=z;t++){
                int pos=k-2*t;

                if(pos<0)
                    continue;

                int sum=0;
                int mx=0;

                for(int i=0;i<=pos;i++){
                    sum+=a[i];
                    if(i<n-1)
                        mx=Math.max(mx,a[i]+a[i+1]);
                }

                ans=Math.max(ans,sum+mx*t);
            }

            System.out.println(ans);
        }
    }
}
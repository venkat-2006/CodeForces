import java.util.*;

public class YaroslavAndProd {//2244D
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            long[] a=new long[n+1];
            for(int i=1;i<=n;i++) a[i]=sc.nextLong();

            int[] b=new int[m];
            for(int i=0;i<m;i++) b[i]=sc.nextInt();

            Arrays.sort(b);

            long ans=0;
            int prev=0;

            for(int x:b){
                long sum=0;
                for(int i=prev+1;i<=x;i++) sum+=a[i];
                ans+=Math.abs(sum);
                prev=x;
            }

            for(int i=prev+1;i<=n;i++) ans+=a[i];

            System.out.println(ans);
        }
    }
}
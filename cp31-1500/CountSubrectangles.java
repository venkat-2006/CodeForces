import java.util.*;

public class CountSubrectangles{//1323B

    static long[] cnt(int[] a){
        int n=a.length;
        long[] c=new long[n+1];
        for(int i=0;i<n;){
            if(a[i]==0){i++;continue;}
            int j=i;
            while(j<n&&a[j]==1)j++;
            int len=j-i;
            for(int k=1;k<=len;k++)c[k]+=len-k+1;
            i=j;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        int[] a=new int[n],b=new int[m];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<m;i++)b[i]=sc.nextInt();

        long[] x=cnt(a),y=cnt(b);
        long ans=0;

        for(int i=1;i*i<=k;i++){
            if(k%i!=0)continue;
            int j=k/i;
            if(i<=n&&j<=m)ans+=x[i]*y[j];
            if(i!=j&&j<=n&&i<=m)ans+=x[j]*y[i];
        }

        System.out.println(ans);
    }
}
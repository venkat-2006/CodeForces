import java.util.*;

public class RowGCD {//1458A

    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        long[] a=new long[n];
        long[] b=new long[m];

        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        for(int i=0;i<m;i++)b[i]=sc.nextLong();

        long g=0;

        for(int i=1;i<n;i++)
            g=gcd(g,Math.abs(a[i]-a[0]));

        for(int i=0;i<m;i++)
            System.out.print(gcd(a[0]+b[i],g)+" ");
    }
}
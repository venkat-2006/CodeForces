import java.util.*;
public class AbsoluteCinemas{//2195D
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] f=new long[n],a=new long[n];
            for(int i=0;i<n;i++) f[i]=sc.nextLong();
            long s=(f[0]+f[n-1])/(n-1);
            a[0]=(s+f[1]-f[0])/2;
            for(int i=1;i<n-1;i++)
                a[i]=(f[i+1]-2*f[i]+f[i-1])/2;
            a[n-1]=(s-f[n-1]+f[n-2])/2;
            for(long x:a) System.out.print(x+" ");
            System.out.println();
        }
    }
}

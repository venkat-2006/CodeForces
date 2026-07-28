import java.util.*;

public class DeleteAndConcat{//2245B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long c=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong()-c;
            Arrays.sort(a);
            long ans=0;
            for(int i=0;i<n/2;i++) ans+=Math.max(0L,a[i]);
            for(int i=n/2;i<n;i++) ans+=a[i];
            System.out.println(ans);
        }
        sc.close();
    }
}
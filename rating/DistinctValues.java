import java.util.*;

public class DistinctValues {//2253C
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            int[] a=new int[x];
            for(int i=0;i<x;i++) a[i]=sc.nextInt();

            int[] b=new int[y];
            for(int i=0;i<y;i++) b[i]=sc.nextInt();

            int i=x-1,j=y-1;
            long ans=0;
            int rows=0,cols=0;

            while(i>=0&&j>=0) {
                if(a[i]>b[j]) {
                    ans+=a[i--];
                    rows++;
                } else {
                    ans+=b[j--];
                    cols++;
                }

                if(rows==n||cols==m) break;
            }

            while(i>=0&&rows<n) {
                ans+=a[i--];
                rows++;
            }

            while(j>=0&&cols<m) {
                ans+=b[j--];
                cols++;
            }

            System.out.println(ans);
        }
    }
}
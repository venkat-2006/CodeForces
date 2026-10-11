import java.util.*;
public class Meeting{//1730B
    static boolean check(double mid,double[] x,double[] a){
        double left=0,right=1e8;
        for(int i=0;i<x.length;i++){
            if(mid<a[i]) return false;
            left=Math.max(left,x[i]-(mid-a[i]));
            right=Math.min(right,x[i]+(mid-a[i]));
        }
        return left<=right;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            double[] x=new double[n],a=new double[n];
            for(int i=0;i<n;i++) x[i]=sc.nextDouble();
            for(int i=0;i<n;i++) a[i]=sc.nextDouble();
            double l=0,r=2e8;
            for(int k=0;k<100;k++){
                double mid=(l+r)/2;
                if(check(mid,x,a)) r=mid;
                else l=mid;
            }
            double left=0,right=1e8;
            for(int i=0;i<n;i++){
                left=Math.max(left,x[i]-(r-a[i]));
                right=Math.min(right,x[i]+(r-a[i]));
            }
            System.out.printf("%.10f%n",(left+right)/2);
        }
        sc.close();
    }
}

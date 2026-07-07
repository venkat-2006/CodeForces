import java.util.*;

public class PredominantFreqDiv{//2242B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();

            int[] p1=new int[n+1];
            int[] p2=new int[n+1];

            for(int i=0;i<n;i++){
                p1[i+1]=p1[i]+(a[i]==1?1:-1);
                p2[i+1]=p2[i]+(a[i]==3?-1:1);
            }

            boolean ok=false;

            for(int i=1;i<=n-2&&!ok;i++){
                if(p1[i]<0)continue;

                for(int j=i+1;j<=n-1;j++){
                    if(p2[j]-p2[i]>=0){
                        ok=true;
                        break;
                    }
                }
            }

            System.out.println(ok?"YES":"NO");
        }
    }
}
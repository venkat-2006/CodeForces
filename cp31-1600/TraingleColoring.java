import java.util.*;

public class TraingleColoring {//1795D
    static final long MOD=998244353L;

    static long pow(long a,long b){
        long res=1;
        while(b>0){
            if((b&1)==1) res=res*a%MOD;
            a=a*a%MOD;
            b>>=1;
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=n/3;
        long ans=1;

        for(int i=0;i<m;i++){
            int[] a={sc.nextInt(),sc.nextInt(),sc.nextInt()};
            Arrays.sort(a);

            if(a[0]==a[2]) ans=ans*3%MOD;
            else if(a[0]==a[1]) ans=ans*2%MOD;
        }

        int k=m/2;
        long num=1,den=1;

        for(int i=1;i<=k;i++){
            num=num*(m-i+1)%MOD;
            den=den*i%MOD;
        }

        ans=ans*num%MOD;
        ans=ans*pow(den,MOD-2)%MOD;

        System.out.println(ans);
    }
}
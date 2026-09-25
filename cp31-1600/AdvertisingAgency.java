import java.util.*; 
 
public class AdvertisingAgency { //1475E
    static final long MOD=1000000007; 
 
    static long pow(long a,long b){ 
        long r=1; 
        while(b>0){ 
            if((b&1)==1) r=r*a%MOD; 
            a=a*a%MOD; 
            b>>=1; 
        } 
        return r; 
    } 
 
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        long[] fact=new long[1001],inv=new long[1001]; 
        fact[0]=1; 
        for(int i=1;i<=1000;i++) fact[i]=fact[i-1]*i%MOD; 
        inv[1000]=pow(fact[1000],MOD-2); 
        for(int i=999;i>=0;i--) inv[i]=inv[i+1]*(i+1)%MOD; 
 
        while(t-->0){ 
            int n=sc.nextInt(),k=sc.nextInt(); 
            int[] a=new int[n]; 
            for(int i=0;i<n;i++) a[i]=sc.nextInt(); 
            Arrays.sort(a); 
 
            int x=a[n-k],total=0,need=0; 
            for(int i=0;i<n;i++){ 
                if(a[i]==x){ 
                    total++; 
                    if(i>=n-k) need++; 
                } 
            } 
 
            long ans=fact[total]*inv[need]%MOD*inv[total-need]%MOD; 
            System.out.println(ans); 
        } 
    } 
}

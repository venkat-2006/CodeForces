import java.util.*;

public class MadamantSkatingDynasty{//2264C
 static final long MOD=998244353;

 static long pow(long a,long b){
  long r=1;
  while(b>0){
   if((b&1)==1)r=r*a%MOD;
   a=a*a%MOD;
   b>>=1;
  }
  return r;
 }

 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();

  while(t-->0){
   int n=sc.nextInt();
   long[] a=new long[n];

   for(int i=0;i<n;i++)
    a[i]=sc.nextLong();

   Arrays.sort(a);

   if(n==1){
    System.out.println(0);
    continue;
   }

   long[] fact=new long[n+1];
   fact[0]=1;

   for(int i=1;i<=n;i++)
    fact[i]=fact[i-1]*i%MOD;

   long[] suf=new long[n+1];

   for(int i=n-1;i>=0;i--)
    suf[i]=(suf[i+1]+a[i])%MOD;

   long ans=0;

   for(int i=0;i<n-1;i++){
    long k=n-1-i;
    long sum=(suf[i+1]-k*(a[i]%MOD)%MOD+MOD)%MOD;
    long ways=fact[n-1]*pow(k,MOD-2)%MOD;
    ans=(ans+ways*sum)%MOD;
   }

   System.out.println(ans);
  }
 }
}

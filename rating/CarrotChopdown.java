import java.util.*;

public class CarrotChopdown{//2258B1
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while(t-->0){
   int n=sc.nextInt(),m=sc.nextInt();
   int[] f=new int[m+1];
   for(int i=0;i<n;i++) f[sc.nextInt()]++;
   int[] suf=new int[m+2];
   for(int i=m;i>=1;i--) suf[i]=suf[i+1]+f[i];
   int ans=0;
   for(int x=1;x<=m;x++){
    int cur=f[x]+suf[x+1];
    if(2*x<=m) cur+=f[2*x];
    ans=Math.max(ans,cur);
   }
   System.out.println(ans);
  }
 }
}

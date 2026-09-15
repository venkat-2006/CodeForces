import java.util.*;

public class MonocarpAndProjects {//2260B
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();

  while(t-->0) {
   long x=sc.nextLong();
   long y=sc.nextLong();
   long k=sc.nextLong();

   long d=y-x,ans=0,i=0;

   while(i<k && x+i<=d)
    ans+=d%(x+i++);

   ans+=(k-i)*d;
   System.out.println(ans);
  }
 }
}

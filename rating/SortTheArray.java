import java.util.*;

public class SortTheArray{//451B
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] a=new int[n],b=new int[n];

  for(int i=0;i<n;i++)
   a[i]=b[i]=s.nextInt();

  Arrays.sort(b);
  int l=0,r=n-1;

  while(l<n&&a[l]==b[l]) l++;
  while(r>=0&&a[r]==b[r]) r--;

  if(l==n){
   System.out.println("yes\n1 1");
   return;
  }

  int L=l,R=r;
  while(l<r){
   int t=a[l];
   a[l++]=a[r];
   a[r--]=t;
  }

  if(Arrays.equals(a,b))
   System.out.println("yes\n"+(L+1)+" "+(R+1));
  else
   System.out.println("no");
 }
}

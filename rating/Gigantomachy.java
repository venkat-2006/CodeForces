import java.util.*;
public class Gigantomachy{//2257B
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            int[]a=new int[n],b=new int[m];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<m;i++)b[i]=sc.nextInt();
            long bea=(long)a[0]+n-1;
            long ver=(long)b[0]+m-1;
            System.out.println(bea>=ver?1:2);
        }
    }
}

import java.util.*;
 
public class RankSubseq{//2250C
 
    static boolean check(int m,int n,int[] l,int[] r,int[] u,int[] v){
        if(m==0) return true;
 
        int j=0;
 
        for(int i=0;i<n;i++){
            int pos=j+1;
 
            if(pos<=m){
                boolean left=pos<l[i]||pos>r[i];
                int right=m-pos+1;
                boolean rev=right<u[i]||right>v[i];
 
                if(left&&rev) j=pos;
            }
        }
 
        return j>=m;
    }
 
    static void solve(Scanner sc){
        int n=sc.nextInt();
 
        int[] l=new int[n];
        int[] r=new int[n];
        int[] u=new int[n];
        int[] v=new int[n];
 
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
            u[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
 
        for(int m=n;m>=1;m--){
            if(check(m,n,l,r,u,v)){
                System.out.println(m);
                return;
            }
        }
 
        System.out.println(0);
    }
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) solve(sc);
    }
}
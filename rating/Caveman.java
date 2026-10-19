import java.util.*;
public class Caveman{//2276D
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt(),m=s.nextInt(),d[]=new int[n];
            for(int i=0;i<m;i++){
                d[s.nextInt()-1]++;
                d[s.nextInt()-1]++;
            }
            boolean iso=false,c=false;
            for(int x:d){
                if(x==0)iso=true;
                if(x==n-1)c=true;
            }
            if(iso)System.out.println("Brain Melt");
            else if(m==n-1&&c)System.out.println("2");
            else System.out.println("Many");
        }
    }
}

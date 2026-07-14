import java.util.*;
public class GamesOnTheTrain{//2032A
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),mx=0;
            int[]h=new int[n];
            for(int i=0;i<n;i++){
                h[i]=sc.nextInt();
                mx=Math.max(mx,h[i]);
            }
            int ans=0;
            for(int i=0;i<n;i++)ans=Math.max(ans,mx+1-h[i]);
            System.out.println(ans);
        }
    }
}
import java.util.*;

public class NimGame{//2239A
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int xor=0;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                xor^=a[i];
            }
            if(n==1){
                System.out.println(0);
                continue;
            }
            if(xor==0){
                System.out.println(1);
                continue;
            }
            int ans=0;

            for(int i=0;i<n;i++)
                if((xor^a[i])<a[i]) ans++;;
            System.out.println(ans);
        }
    }
}
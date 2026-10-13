import java.util.*;

public class MexGame{//2271B
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[] f=new int[n+1];
            for(int i=0;i<n;i++) f[sc.nextInt()]++;

            for(int i=0;i<=n;i++){
                if(f[i]<2*k){
                    System.out.println(f[i]==2*k-1?"YES":"NO");
                    break;
                }
            }
        }
    }
}

import java.util.*;

public class ZeroSum{//2247A
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),cnt=0;
            for(int i=0;i<n;i++){
                if(sc.nextInt()==1)cnt++;
            }
            if(n%2==1)System.out.println("NO");
            else if(cnt%2==(n/2)%2)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
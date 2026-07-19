import java.util.*;

public class YetAnotherConstructive{//2247B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            long m=sc.nextLong();
            if(m<k){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for(int i=1;i<=n;i++){
                if(i>1)System.out.print(" ");
                if(i%k==0)System.out.print(m-k+1);
                else System.out.print(1);
            }
            System.out.println();
        }
    }
}
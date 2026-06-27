import java.util.*;

public class DuckSurplus{//2237C

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            long ans=0;

            for(int i=0;i<n;i++){
                long x=sc.nextLong();

                if(ans>x) ans+=x;
                else ans=x;
            }

            System.out.println(ans);
        }
    }
}
import java.util.*;

public class BestCard {//2253A
    static boolean prime(int x){
        if(x<2) return false;
        for(int i=2;i*i<=x;i++)
            if(x%i==0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            System.out.println(prime(n+1)?"YES":"NO");
        }
    }
}
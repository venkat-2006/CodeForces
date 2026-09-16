import java.util.*;

public class Fadi {//1285C
    static long gcd(long a,long b){
        while(b!=0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long a=1,b=x;

        for(long i=1;i*i<=x;i++){
            if(x%i==0){
                long j=x/i;
                if(gcd(i,j)==1){
                    a=i;
                    b=j;
                }
            }
        }

        System.out.println(a+" "+b);
    }
}

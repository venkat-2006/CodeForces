import java.util.*;

public class InterestingSeq{//1775C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long n=sc.nextLong(),x=sc.nextLong();
            if(n==x){
                System.out.println(n);
                continue;
            }
            if((n&x)!=x){
                System.out.println(-1);
                continue;
            }

            long d=n^x;
            long p=1,cur=n;
            while(p<=d){
                if((cur&p)!=0) cur^=p;
                p<<=1;
            }

            if((n&p)!=0){
                System.out.println(-1);
                continue;
            }

            cur|=p;
            if((n&cur)==x) System.out.println(cur);
            else System.out.println(-1);
        }
        sc.close();
    }
}
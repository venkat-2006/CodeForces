import java.util.*;
public class Omsk{//2236C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long x=sc.nextLong();

            if(a==b){
                System.out.println(0);
                continue;
            }

            if(Math.abs(a-b)==1){
                System.out.println(1);
                continue;
            }

            if(a<x&&b<x){
                System.out.println(2);
                continue;
            }

            long ans=Long.MAX_VALUE;
            long op=0;

            while(a!=b){
                if(a<b){
                    long temp=a;
                    a=b;
                    b=temp;
                }

                ans=Math.min(ans,op+a-b);
                a/=x;
                op++;
            }

            System.out.println(Math.min(ans,op));
        }
        sc.close();
    }
}
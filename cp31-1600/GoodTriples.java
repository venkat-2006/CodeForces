// Write your solution here
import java.util.*;
public class GoodTriples {//1907E
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long[] ways={1,3,6,10,15,21,28,36,45,55};
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(1);
                continue;
            }
            long ans=1;
            while(n>0){
                ans*=ways[n%10];
                n/=10;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
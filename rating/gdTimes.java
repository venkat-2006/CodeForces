import java.util.*;

public class gdTimes{//2241B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long p=1;
            while(p<=x)p*=10;
            System.out.println(p+1);
        }
    }
}
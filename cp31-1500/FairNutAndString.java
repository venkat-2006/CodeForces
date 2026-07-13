import java.util.*;

public class FairNutAndString{//1084C

    static final long MOD=1000000007L;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        long ans=1;
        int cnt=0;

        for(char c:s.toCharArray()){
            if(c=='a')cnt++;
            else if(c=='b'){
                ans=ans*(cnt+1)%MOD;
                cnt=0;
            }
        }

        ans=ans*(cnt+1)%MOD;
        System.out.println((ans-1+MOD)%MOD);
    }
}
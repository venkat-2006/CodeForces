import java.io.*;
import java.util.*;

public class FactAndPowerOfTwo {//1646C

    static ArrayList<Long> fact=new ArrayList<>();

    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long f=6;
        for(long i=3;f<=1000000000000L;i++){
            fact.add(f);
            f*=i+1;
        }

        int t=Integer.parseInt(br.readLine());

        while(t-->0){
            long n=Long.parseLong(br.readLine());
            int ans=Long.bitCount(n);

            int m=fact.size();

            for(int mask=1;mask<(1<<m);mask++){
                long sum=0;
                int cnt=0;
                boolean ok=true;

                for(int i=0;i<m;i++){
                    if((mask&(1<<i))!=0){
                        sum+=fact.get(i);
                        cnt++;
                        if(sum>n){
                            ok=false;
                            break;
                        }
                    }
                }

                if(ok){
                    ans=Math.min(ans,cnt+Long.bitCount(n-sum));
                }
            }

            System.out.println(ans);
        }
    }
}
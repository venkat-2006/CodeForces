import java.util.*;

public class BossFight {//2252A
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            long sum=0;
            int maxFreq=0,val=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                sum+=x;
                int f=map.getOrDefault(x,0)+1;
                map.put(x,f);
                if(f>maxFreq){
                    maxFreq=f;
                    val=x;
                }
            }
            if(maxFreq<=(n+1)/2)System.out.println(sum);
            else{
                int others=n-maxFreq;
                long ans=(sum-(long)maxFreq*val)+(long)(others+2)*val;
                System.out.println(ans);
            }
        }
    }
}
import java.util.*;

public class ZeroQunatityMaximization{//1133D

    static long gcd(long a,long b){
        return b==0?Math.abs(a):gcd(b,a%b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long[] a=new long[n],b=new long[n];

        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        for(int i=0;i<n;i++)b[i]=sc.nextLong();

        HashMap<String,Integer> map=new HashMap<>();
        int ans=0,mx=0;

        for(int i=0;i<n;i++){
            if(a[i]==0){
                if(b[i]==0)ans++;
                continue;
            }

            long x=-b[i],y=a[i];
            if(y<0){
                x=-x;
                y=-y;
            }

            long g=gcd(x,y);
            x/=g;
            y/=g;

            String s=x+"/"+y;
            int c=map.getOrDefault(s,0)+1;
            map.put(s,c);
            mx=Math.max(mx,c);
        }

        System.out.println(ans+mx);
    }
}
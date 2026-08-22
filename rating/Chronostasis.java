import java.util.*;

public class Chronostasis {//2254E
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            int n=sc.nextInt();
            TreeMap<Long,Integer> map=new TreeMap<>();

            for(int i=0;i<n;i++) {
                long x=sc.nextLong();
                map.put(x,map.getOrDefault(x,0)+1);
            }

            long sum=0;
            long ans[]=new long[n];
            boolean possible=true;

            for(int i=0;i<n;i++) {
                Long x=map.higherKey(-sum);

                if(x==null) {
                    possible=false;
                    break;
                }

                sum+=x;
                ans[i]=sum;

                if(map.get(x)==1)
                    map.remove(x);
                else
                    map.put(x,map.get(x)-1);
            }

            if(!possible)
                System.out.println(-1);
            else {
                for(long x:ans)
                    System.out.print(x+" ");
                System.out.println();
            }
        }
    }
}
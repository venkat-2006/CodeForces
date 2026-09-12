import java.util.*;

public class GoodSubarrays {//1398C
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            int n=sc.nextInt();
            String s=sc.next();

            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);

            int prefix=0;
            long ans=0;

            for(int i=0;i<n;i++) {
                prefix+=s.charAt(i)-'0';

                int key=prefix-(i+1);

                ans+=map.getOrDefault(key,0);
                map.put(key,map.getOrDefault(key,0)+1);
            }

            System.out.println(ans);
        }
    }
}

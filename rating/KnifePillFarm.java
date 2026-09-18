// Knife's Pill Farm
import java.util.*;
public class KnifePillFarm{//2264B
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt(),m=s.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();

            PriorityQueue<Integer>q=
                new PriorityQueue<>(Collections.reverseOrder());
            long sum=0,ans=Long.MIN_VALUE;

            for(int i=0;i<n;i++){
                if(q.size()==m-1)
                    ans=Math.max(ans,(long)m*a[i]-sum);

                q.add(a[i]);
                sum+=a[i];

                if(q.size()>m-1)
                    sum-=q.poll();
            }
            System.out.println(ans);
        }
    }
}

import java.util.*;

public class Kaiko{//2269B

    // Sum of squares of digits
    static int next(int x){
        int sum=0;

        while(x>0){
            int d=x%10;
            sum+=d*d;
            x/=10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            HashMap<Integer,Integer> map=new HashMap<>();

            for(int i=0;i<n;i++){
                int x=sc.nextInt();

                // Move every number far enough into its cycle
                for(int j=0;j<100;j++)
                    x=next(x);

                map.put(x,map.getOrDefault(x,0)+1);
            }

            long ans=0;

            // If k numbers reach the same state,
            // they give k*(k-1)/2 pairs
            for(int count:map.values())
                ans+=(long)count*(count-1)/2;

            System.out.println(ans);
        }
    }
}

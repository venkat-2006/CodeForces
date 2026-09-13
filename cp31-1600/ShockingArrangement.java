import java.util.*;

public class ShockingArrangement { //1798D
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0) {
            int n=sc.nextInt();

            ArrayList<Integer> pos=new ArrayList<>();
            ArrayList<Integer> neg=new ArrayList<>();

            int max=0;

            for(int i=0;i<n;i++) {
                int x=sc.nextInt();

                max=Math.max(max,x);

                if(x>=0)
                    pos.add(x);
                else
                    neg.add(x);
            }

            if(max==0) {
                System.out.println("NO");
                continue;
            }

            int[] ans=new int[n];
            long sum=0;

            for(int i=0;i<n;i++) {

                if(sum<=0) {
                    ans[i]=pos.get(pos.size()-1);
                    pos.remove(pos.size()-1);
                }
                else {
                    ans[i]=neg.get(neg.size()-1);
                    neg.remove(neg.size()-1);
                }

                sum+=ans[i];
            }

            System.out.println("YES");

            for(int x:ans)
                System.out.print(x+" ");

            System.out.println();
        }
    }
}

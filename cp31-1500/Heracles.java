import java.util.*;

public class Heracles{//1466D
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            long[] w=new long[n+1];
            int[] d=new int[n+1];
            for(int i=1;i<=n;i++){
                w[i]=sc.nextLong();
                sum+=w[i];
            }
            for(int i=1;i<n;i++){
                int u=sc.nextInt(),v=sc.nextInt();
                d[u]++;
                d[v]++;
            }
            ArrayList<Long> a=new ArrayList<>();
            for(int i=1;i<=n;i++)
                for(int j=1;j<d[i];j++)
                    a.add(w[i]);
            Collections.sort(a,Collections.reverseOrder());
            System.out.print(sum);
            for(long x:a){
                sum+=x;
                System.out.print(" "+sum);
            }
            System.out.println();
        }
    }
}
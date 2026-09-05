import java.util.*;

public class RoundDance {//1833E
    static int[] parent;

    static int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }

    static void union(int a,int b){
        int pa=find(a),pb=find(b);
        if(pa!=pb) parent[pb]=pa;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            parent=new int[n+1];
            int[] a=new int[n+1];

            for(int i=1;i<=n;i++) parent[i]=i;

            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
                union(i,a[i]);
            }

            int max=0;
            for(int i=1;i<=n;i++){
                if(find(i)==i) max++;
            }

            System.out.println(max);
        }
    }
}
import java.util.*;
public class Linova {//1336A
    static int[] depth,size;
    static void dfs(int u,int parent,List<List<Integer>> g){
        size[u]=1;
        for(int v:g.get(u)){
            if(v==parent) continue;
            depth[v]=depth[u]+1;
            dfs(v,u,g);
            size[u]+=size[v];
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<=n;i++) g.add(new ArrayList<>());
        for(int i=1;i<n;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        depth=new int[n+1];
        size=new int[n+1];
        dfs(1,0,g);
        long[] value=new long[n];
        for(int i=1;i<=n;i++)
            value[i-1]=depth[i]-size[i]+1L;
        Arrays.sort(value);
        long ans=0;
        for(int i=n-1;i>=n-k;i--)
            ans+=value[i];
        System.out.println(ans);
        sc.close();
    }
}
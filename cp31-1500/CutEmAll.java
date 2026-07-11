import java.util.*;

public class CutEmAll{//982C

    static ArrayList<Integer>[] g;
    static int ans=0;

    static int dfs(int u,int p){
        int sz=1;
        for(int v:g[u]){
            if(v==p)continue;
            int child=dfs(v,u);
            if(child%2==0)ans++;
            else sz+=child;
        }
        return sz;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n%2==1){
            System.out.println(-1);
            return;
        }

        g=new ArrayList[n+1];
        for(int i=1;i<=n;i++)g[i]=new ArrayList<>();

        for(int i=0;i<n-1;i++){
            int u=sc.nextInt(),v=sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }

        dfs(1,0);
        System.out.println(ans);
        sc.close();
    }
}
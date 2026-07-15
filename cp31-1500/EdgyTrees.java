import java.util.*;

public class EdgyTrees{//1139C
    static final long MOD=1000000007;
    static ArrayList<Integer>[] g;
    static boolean[] vis;
    static int cnt;

    static void dfs(int u){
        vis[u]=true;
        cnt++;
        for(int v:g[u]){
            if(!vis[v])dfs(v);
        }
    }

    static long power(long a,long b){
        long res=1;
        while(b>0){
            if((b&1)==1)res=res*a%MOD;
            a=a*a%MOD;
            b>>=1;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();

        g=new ArrayList[n+1];
        for(int i=1;i<=n;i++)g[i]=new ArrayList<>();

        for(int i=0;i<n-1;i++){
            int u=sc.nextInt(),v=sc.nextInt(),x=sc.nextInt();
            if(x==0){
                g[u].add(v);
                g[v].add(u);
            }
        }

        vis=new boolean[n+1];
        long bad=0;

        for(int i=1;i<=n;i++){
            if(!vis[i]){
                cnt=0;
                dfs(i);
                bad=(bad+power(cnt,k))%MOD;
            }
        }

        long ans=(power(n,k)-bad+MOD)%MOD;
        System.out.println(ans);
        sc.close();
    }
}
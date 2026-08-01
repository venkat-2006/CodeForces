import java.util.*;

public class SplitIntoTwoSets {//1702E

    static HashMap<Integer,ArrayList<Integer>> graph;
    static boolean[] vis;

    static int dfs(int node){
        vis[node]=true;
        for(int next:graph.get(node)){
            if(!vis[next]) return dfs(next)+1;
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            graph=new HashMap<>();
            vis=new boolean[n+1];

            for(int i=1;i<=n;i++) graph.put(i,new ArrayList<>());

            boolean fault=false;

            for(int i=0;i<n;i++){
                int x=sc.nextInt(),y=sc.nextInt();
                graph.get(x).add(y);
                graph.get(y).add(x);
                if(x==y||graph.get(x).size()>2||graph.get(y).size()>2) fault=true;
            }

            if(fault){
                System.out.println("NO");
                continue;
            }

            boolean ok=true;
            for(int i=1;i<=n;i++){
                if(!vis[i]&&dfs(i)%2==1){
                    ok=false;
                    break;
                }
            }

            System.out.println(ok?"YES":"NO");
        }
    }
}
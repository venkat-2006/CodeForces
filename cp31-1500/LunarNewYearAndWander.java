import java.util.*;

public class LunarNewYearAndWander{//1106D
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        ArrayList<Integer>[] graph=new ArrayList[n+1];
        for(int i=1;i<=n;i++)graph[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            int u=sc.nextInt(),v=sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        boolean[] vis=new boolean[n+1];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        vis[1]=true;
        pq.offer(1);
        while(!pq.isEmpty()){
            int cur=pq.poll();
            System.out.print(cur+" ");
            for(int nxt:graph[cur]){
                if(!vis[nxt]){
                    vis[nxt]=true;
                    pq.offer(nxt);
                }
            }
        }
        sc.close();
    }
}
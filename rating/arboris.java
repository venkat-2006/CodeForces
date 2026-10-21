import java.util.*;
 
public class Arboris {//2131D
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            List<Integer>[] adj=new ArrayList[n+1];
            for(int i=1;i<=n;i++) adj[i]=new ArrayList<>();
            for(int i=0;i<n-1;i++) {
                int u=sc.nextInt(),v=sc.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            if(n<=3) {
                System.out.println(0);
                continue;
            }
            int leaves=0,maxLeaves=0;
            for(int i=1;i<=n;i++) {
                if(adj[i].size()==1) leaves++;
                int count=0;
                for(int v:adj[i])
                    if(adj[v].size()==1) count++;
                maxLeaves=Math.max(maxLeaves,count);
            }
            System.out.println(leaves-maxLeaves);
        }
    }
}

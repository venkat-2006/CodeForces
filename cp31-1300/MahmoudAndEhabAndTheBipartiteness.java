import java.util.*;
public class MahmoudAndEhabAndTheBipartiteness{//862B
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     ArrayList<Integer> g[]=new ArrayList[n+1];
     for(int i=1;i<=n;i++){
      g[i]=new ArrayList<>();
     }
     for(int i=0;i<n-1;i++){
      int u=sc.nextInt();
      int v=sc.nextInt();
      g[u].add(v);
      g[v].add(u);
     }
     int color[]=new int[n+1];
     Queue<Integer> q=new LinkedList<>();
     q.add(1);
     color[1]=1;
     while(!q.isEmpty()){
      int u=q.poll();
      for(int v:g[u]){
        if(color[v]==0){
          color[v]=3-color[u];
          q.add(v);
        }
      }
     }
      long c1 = 0, c2 = 0;
        for(int i = 1; i <= n; i++){
            if(color[i] == 1) c1++;
            else c2++;
        }

        System.out.println(c1 * c2 - (n - 1));

     sc.close();
  }

}
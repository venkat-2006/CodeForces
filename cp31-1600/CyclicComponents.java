import java.util.*;

public class CyclicComponents{//977E
    static int[] p;

    static int find(int x){
        if(p[x]==x) return x;
        else return p[x]=find(p[x]);
    }

    static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a!=b) p[b]=a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        p=new int[n];
        int[] d=new int[n];

        for(int i=0;i<n;i++) p[i]=i;

        for(int i=0;i<m;i++){
            int u=sc.nextInt()-1,v=sc.nextInt()-1;
            d[u]++;
            d[v]++;
            union(u,v);
        }

        boolean[] bad=new boolean[n];

        for(int i=0;i<n;i++){
            if(d[i]!=2) bad[find(i)]=true;
        }

        int ans=0;

        for(int i=0;i<n;i++){
            if(find(i)==i){
                if(!bad[i]) ans++;
            }
        }

        System.out.println(ans);
    }
}

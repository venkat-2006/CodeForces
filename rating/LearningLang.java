import java.util.*;

public class LearningLang{//277A
    static int[] p;

    static int find(int x){
        if(p[x]!=x)p[x]=find(p[x]);
        return p[x];
    }

    static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a!=b)p[a]=b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();

        p=new int[n+m];
        for(int i=0;i<n+m;i++)p[i]=i;

        boolean[] has=new boolean[n];

        for(int i=0;i<n;i++){
            int k=sc.nextInt();

            if(k>0)has[i]=true;

            for(int j=0;j<k;j++){
                int lang=sc.nextInt()-1;
                union(i,n+lang);
            }
        }

        boolean any=false;
        for(boolean x:has)
            if(x)any=true;

        if(!any){
            System.out.println(n);
            return;
        }

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++)
            set.add(find(i));

        System.out.println(set.size()-1);
    }
}

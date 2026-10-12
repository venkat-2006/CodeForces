import java.util.*;
import java.io.*;

public class ParsaHumongousTree{//1528A
    static int arr[][];
    static ArrayList<Integer> adj[];
    static long dp[][];
    static int parent[],order[];

    public static void main(String args[]) throws Exception{
        FastScanner sc=new FastScanner();
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            arr=new int[n][2];
            int b[][]=new int[n-1][2];

            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }

            for(int i=0;i<n-1;i++){
                b[i][0]=sc.nextInt()-1;
                b[i][1]=sc.nextInt()-1;
            }

            adj=new ArrayList[n];
            dp=new long[n][2];
            parent=new int[n];
            order=new int[n];

            for(int i=0;i<n;i++){
                adj[i]=new ArrayList<>();
                parent[i]=-1;
            }

            for(int e[]:b){
                adj[e[0]].add(e[1]);
                adj[e[1]].add(e[0]);
            }

            int stack[]=new int[n];
            int top=0,size=0;
            stack[top++]=0;
            parent[0]=0;

            while(top>0){
                int v=stack[--top];
                order[size++]=v;

                for(int u:adj[v]){
                    if(parent[u]!=-1) continue;
                    parent[u]=v;
                    stack[top++]=u;
                }
            }

            for(int i=size-1;i>=0;i--){
                int v=order[i];

                for(int u:adj[v]){
                    if(parent[u]!=v) continue;

                    dp[v][0]+=Math.max(
                        dp[u][0]+Math.abs(arr[v][0]-arr[u][0]),
                        dp[u][1]+Math.abs(arr[v][0]-arr[u][1])
                    );

                    dp[v][1]+=Math.max(
                        dp[u][0]+Math.abs(arr[v][1]-arr[u][0]),
                        dp[u][1]+Math.abs(arr[v][1]-arr[u][1])
                    );
                }
            }

            System.out.println(Math.max(dp[0][0],dp[0][1]));
        }
    }

    static class FastScanner{
        BufferedInputStream in=new BufferedInputStream(System.in);

        int nextInt() throws IOException{
            int c;
            do{
                c=in.read();
            }while(c<=32);

            int num=0;
            while(c>32){
                num=num*10+c-'0';
                c=in.read();
            }
            return num;
        }
    }
}

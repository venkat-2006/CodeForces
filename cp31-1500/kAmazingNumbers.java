// Write your solution here
import java.util.*;

public class kAmazingNumbers{//1416A

    static class FastScanner{
        private final byte[] buffer=new byte[1<<16];
        private int ptr=0,len=0;

        private int read() throws Exception{
            if(ptr>=len){
                len=System.in.read(buffer);
                ptr=0;
                if(len==-1)return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws Exception{
            int c=read();
            while(c<=32)c=read();
            int sign=1;
            if(c=='-'){
                sign=-1;
                c=read();
            }
            int val=0;
            while(c>32){
                val=val*10+c-'0';
                c=read();
            }
            return val*sign;
        }
    }

    public static void main(String args[]) throws Exception{
        FastScanner sc=new FastScanner();
        StringBuilder out=new StringBuilder();

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];

            ArrayList<Integer>[] pos=new ArrayList[n+1];
            for(int i=1;i<=n;i++)pos[i]=new ArrayList<>();

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                pos[a[i]].add(i+1);
            }

            int ans[]=new int[n+1];
            Arrays.fill(ans,Integer.MAX_VALUE);

            for(int x=1;x<=n;x++){
                int last=0,maxGap=0;
                for(int p:pos[x]){
                    maxGap=Math.max(maxGap,p-last);
                    last=p;
                }
                maxGap=Math.max(maxGap,n+1-last);
                if(maxGap<=n)ans[maxGap]=Math.min(ans[maxGap],x);
            }

            for(int i=2;i<=n;i++)
                ans[i]=Math.min(ans[i],ans[i-1]);

            for(int i=1;i<=n;i++){
                if(ans[i]==Integer.MAX_VALUE)out.append("-1 ");
                else out.append(ans[i]).append(" ");
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}
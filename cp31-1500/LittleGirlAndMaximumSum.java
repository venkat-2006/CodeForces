import java.io.*;
import java.util.*;

public class LittleGirlAndMaximumSum {//276C

    static class FastScanner{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws Exception{
            while(st==null||!st.hasMoreElements())
                st=new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws Exception{
            return Integer.parseInt(next());
        }
    }

    public static void main(String args[]) throws Exception{
        FastScanner sc=new FastScanner();

        int n=sc.nextInt();
        int q=sc.nextInt();

        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        long diff[]=new long[n+2];

        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            diff[l]++;
            diff[r+1]--;
        }

        long freq[]=new long[n];
        long cur=0;
        for(int i=1;i<=n;i++){
            cur+=diff[i];
            freq[i-1]=cur;
        }

        Arrays.sort(a);
        Arrays.sort(freq);

        long ans=0;
        for(int i=0;i<n;i++)
            ans+=a[i]*freq[i];

        System.out.println(ans);
    }
}
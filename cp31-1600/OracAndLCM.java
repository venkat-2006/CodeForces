import java.io.*;
import java.util.*;

public class OracAndLCM{//1349A
    static class FastScanner{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nextInt() throws IOException{
            while(st==null || !st.hasMoreTokens())
                st=new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String args[]) throws Exception{
        FastScanner sc=new FastScanner();

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int max=200000;
        int first[]=new int[max+1];
        int second[]=new int[max+1];
        int count[]=new int[max+1];

        Arrays.fill(first,Integer.MAX_VALUE);
        Arrays.fill(second,Integer.MAX_VALUE);

        for(int x:arr){
            int temp=x;

            for(int p=2;p*p<=temp;p++){
                if(temp%p==0){
                    int cnt=0;

                    while(temp%p==0){
                        cnt++;
                        temp/=p;
                    }

                    count[p]++;

                    if(cnt<first[p]){
                        second[p]=first[p];
                        first[p]=cnt;
                    }
                    else if(cnt<second[p]){
                        second[p]=cnt;
                    }
                }
            }

            if(temp>1){
                int p=temp;
                int cnt=1;

                count[p]++;

                if(cnt<first[p]){
                    second[p]=first[p];
                    first[p]=cnt;
                }
                else if(cnt<second[p]){
                    second[p]=cnt;
                }
            }
        }

        long ans=1;

        for(int p=2;p<=max;p++){
            int zero=n-count[p];

            if(zero>=2)
                continue;

            int power;

            if(zero==1)
                power=first[p];
            else
                power=second[p];

            for(int k=0;k<power;k++)
                ans*=p;
        }

        System.out.println(ans);
    }
}
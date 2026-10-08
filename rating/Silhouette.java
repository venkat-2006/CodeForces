import java.util.*;

public class Silhouette{//2254D
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long[][] b=new long[n][2];

            for(int i=0;i<n;i++){
                b[i][0]=sc.nextLong();
                b[i][1]=i;
            }

            Arrays.sort(b,(x,y)->Long.compare(x[0],y[0]));

            if(b[0][0]!=0){
                System.out.println(-1);
                continue;
            }

            long[] ans=new long[n];
            long sum=0,value=1;
            int pos=0;
            boolean ok=true;

            while(pos<n){
                int end=pos;

                while(end<n&&b[end][0]==b[pos][0])
                    end++;

                int cnt=end-pos;

                if(end==n){
                    if(pos==0)
                        value=1;
                    else
                        value++;
                }else{
                    long diff=b[end][0]-sum;

                    if(diff<=0||diff%cnt!=0){
                        ok=false;
                        break;
                    }

                    value=diff/cnt;
                }

                if(pos>0&&value<=ans[(int)b[pos-1][1]]){
                    ok=false;
                    break;
                }

                for(int i=pos;i<end;i++)
                    ans[(int)b[i][1]]=value;

                sum+=value*cnt;
                pos=end;
            }

            if(!ok)
                System.out.println(-1);
            else{
                for(long x:ans)
                    System.out.print(x+" ");
                System.out.println();
            }
        }
    }
}

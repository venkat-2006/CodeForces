import java.util.*;

public class DistinctValues{//2253C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int TestsNumT=sc.nextInt();

        while(TestsNumT-->0){
            int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
            int[] a=new int[x],b=new int[y];

            for(int i=0;i<x;i++) a[i]=sc.nextInt();
            for(int i=0;i<y;i++) b[i]=sc.nextInt();

            int i=x-1,j=y-1;
            int ca=0,cb=0,cnt=0;
            long ans=0;

            while(i>=0||j>=0){
                int v;
                boolean ina=false,inb=false;

                if(j<0||i>=0&&a[i]>b[j]){
                    v=a[i--];
                    ina=true;
                }else if(i<0||b[j]>a[i]){
                    v=b[j--];
                    inb=true;
                }else{
                    v=a[i--];
                    j--;
                    ina=inb=true;
                }

                if(cnt==n+m-1) break;

                if(ina&&!inb&&ca==n) continue;
                if(inb&&!ina&&cb==m) continue;

                if(ina&&!inb) ca++;
                if(inb&&!ina) cb++;

                ans+=v;
                cnt++;
            }

            System.out.println(ans);
        }
    }
}
import java.util.*;
public class DeepDownBelow {//1561C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();

            long[][] caves=new long[n][2];
            for(int i=0;i<n;i++){
                int k=sc.nextInt();
                long max=0;

                for(int j=0;j<k;j++){
                    long a=sc.nextLong();
                    max=Math.max(max,a-j);

                }
                caves[i][0]=max+1;
                caves[i][1]=k;
            }

            Arrays.sort(caves,(a,b)->Long.compare(a[0],b[0]));
            long start=0;
            long curr=0;

            for(int i=0;i<n;i++){
                if(curr<caves[i][0]){
                    long diff=caves[i][0]-curr;
                    start+=diff;
                    curr+=diff;
                }
                curr+=caves[i][0];

            }
            System.out.println(start);
        }
    }

    
}

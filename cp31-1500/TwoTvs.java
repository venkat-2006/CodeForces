import java.util.*;

public class TwoTvs{//845C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] shows=new int[n][2];
        for(int i=0;i<n;i++){
            shows[i][0]=sc.nextInt();
            shows[i][1]=sc.nextInt();
        }
        Arrays.sort(shows,(a,b)->a[0]-b[0]);
        int tv1=-1,tv2=-1;
        for(int[] show:shows){
            int start=show[0],end=show[1];
            if(tv1<start) tv1=end;
            else if(tv2<start) tv2=end;
            else{
                System.out.println("NO");
                return;
            }
            if(tv1>tv2){
                int temp=tv1;
                tv1=tv2;
                tv2=temp;
            }
        }
        System.out.println("YES");
    }
}
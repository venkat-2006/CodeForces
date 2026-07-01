import java.util.*;

public class NestedSegments{//976C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            a[i][2]=i+1;
        }
        Arrays.sort(a,(x,y)->x[0]==y[0]?y[1]-x[1]:x[0]-y[0]);
        int mx=a[0][1],id=a[0][2];
        for(int i=1;i<n;i++){
            if(a[i][1]<=mx){
                System.out.println(a[i][2]+" "+id);
                return;
            }
            if(a[i][1]>mx){
                mx=a[i][1];
                id=a[i][2];
            }
        }
        System.out.println("-1 -1");
    }
}
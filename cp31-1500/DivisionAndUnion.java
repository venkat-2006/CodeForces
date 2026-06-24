import java.util.*;

public class DivisionAndUnion{//1101C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] arr=new int[n][3];
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
                arr[i][2]=i;
            }

            Arrays.sort(arr,(a,b)->a[0]-b[0]);

            int maxR=arr[0][1],split=-1;
            for(int i=1;i<n;i++){
                if(arr[i][0]>maxR){
                    split=i;
                    break;
                }
                maxR=Math.max(maxR,arr[i][1]);
            }

            if(split==-1){
                System.out.println(-1);
                continue;
            }

            int[] ans=new int[n];
            for(int i=0;i<split;i++) ans[arr[i][2]]=1;
            for(int i=split;i<n;i++) ans[arr[i][2]]=2;

            for(int x:ans) System.out.print(x+" ");
            System.out.println();
        }
        sc.close();
    }
}
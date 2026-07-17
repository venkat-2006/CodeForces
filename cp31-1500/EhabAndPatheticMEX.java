import java.util.*;
public class EhabAndPatheticMEX{//1325C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),deg[]=new int[n+1],ans[]=new int[n],graph[][]=new int[n][2];
        for(int i=1;i<n;i++){
            graph[i][0]=sc.nextInt();
            graph[i][1]=sc.nextInt();
            deg[graph[i][0]]++;
            deg[graph[i][1]]++;
        }
        Arrays.fill(ans,-1);
        int cur=0;
        for(int i=1;i<n&&cur<3;i++)
            if(deg[graph[i][0]]==1||deg[graph[i][1]]==1)
                ans[i]=cur++;
        for(int i=1;i<n;i++)
            if(ans[i]==-1)
                ans[i]=cur++;
        for(int i=1;i<n;i++)
            System.out.println(ans[i]);
        sc.close();
    }
}
import java.util.*;

public class MinimizeTheError{//960B
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k1=sc.nextInt();
        int k2=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int diff[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            diff[i]=Math.abs(a[i]-b[i]);
        }

        int k=k1+k2;

        while(k-->0){
            Arrays.sort(diff);
            if(diff[n-1]>0){
                diff[n-1]--;
            }else{
                diff[n-1]++;
            }
        }

        long ans=0;
        for(int i=0;i<n;i++){
            ans+=1L*diff[i]*diff[i];
        }

        System.out.println(ans);
        sc.close();
    }
}
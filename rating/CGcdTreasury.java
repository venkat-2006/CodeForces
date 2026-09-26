import java.util.*;

public class CGcdTreasury{//2267C
    static ArrayList<Integer> getfactors(int x){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                l.add(i);
                while(x%i==0)x/=i;
            }
        }
        if(x>1)l.add(x);
        return l;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt();
            int[] a=new int[n];

            for(int i=0;i<n;i++)a[i]=sc.nextInt();

            long ans=0;
            for(int p:getfactors(x)){
                long s=0;
                for(int i=0;i<n;i++)
                    if(a[i]%p==0)s+=a[i];
                ans=Math.max(ans,s);
            }

            System.out.println(ans);
        }
    }
}

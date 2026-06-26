import java.util.*;
public class AnnoyingTheGhost{//2237B
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n],c=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();

            TreeSet<Integer>s=new TreeSet<>();
            for(int i=0;i<n;i++)s.add(sc.nextInt());

            boolean ok=true;
            for(int i=0;i<n;i++){
                Integer x=s.ceiling(a[i]);
                if(x==null){
                    ok=false;
                    break;
                }
                c[i]=x;
                s.remove(x);
            }

            if(!ok){
                System.out.println(-1);
                continue;
            }

            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(c[i]>c[j])ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
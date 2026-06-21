import java.util.*;

public class DataStructuresFan {//1872E
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder ans=new StringBuilder();

        while(t-->0){
            int n=sc.nextInt();

            int[] a=new int[n+1];
            int[] pref=new int[n+1];

            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
                pref[i]=pref[i-1]^a[i];
            }

            String s=sc.next();

            int x0=0,x1=0;
            for(int i=1;i<=n;i++){
                if(s.charAt(i-1)=='0')x0^=a[i];
                else x1^=a[i];
            }

            int q=sc.nextInt();

            while(q-->0){
                int tp=sc.nextInt();

                if(tp==1){
                    int l=sc.nextInt();
                    int r=sc.nextInt();

                    int val=pref[r]^pref[l-1];
                    x0^=val;
                    x1^=val;
                }else{
                    int g=sc.nextInt();
                    ans.append(g==0?x0:x1).append(" ");
                }
            }
            ans.append("\n");
        }

        System.out.print(ans);
        sc.close();
    }
}
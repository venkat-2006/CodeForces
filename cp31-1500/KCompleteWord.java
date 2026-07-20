import java.util.*;
public class KCompleteWord{//1332C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            char[] s=sc.next().toCharArray();
            int ans=0;
            for(int i=0;i<=(k-1)/2;i++){
                int[] f=new int[26];
                int tot=0,mx=0;
                for(int j=i;j<n;j+=k){
                    int x=s[j]-'a';
                    f[x]++;
                    mx=Math.max(mx,f[x]);
                    tot++;
                }
                if(i!=k-1-i){
                    for(int j=k-1-i;j<n;j+=k){
                        int x=s[j]-'a';
                        f[x]++;
                        mx=Math.max(mx,f[x]);
                        tot++;
                    }
                }
                ans+=tot-mx;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
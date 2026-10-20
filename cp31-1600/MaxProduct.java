import java.util.*;
public class MaxProduct{//1660D
    static void solve(Scanner sc){
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int ans=0,ap=n,as=0;
        for(int i=0,l=-1;i<=n;i++){
            if(i==n||a[i]==0){
                int cnt=0;
                boolean neg=false;
                int left=-1,right=-1,cl=0,cr=0;
                for(int j=l+1;j<i;j++){
                    neg^=a[j]<0;
                    if(a[j]<0){
                        right=j;
                        cr=0;
                    }
                    if(Math.abs(a[j])==2){
                        cnt++;
                        cr++;
                        if(left==-1)cl++;
                    }
                    if(a[j]<0&&left==-1)left=j;
                }
                if(neg){
                    if(cnt-cl>cnt-cr){
                        right=i;
                        cnt-=cl;
                    }else{
                        left=l;
                        cnt-=cr;
                    }
                }else{
                    left=l;
                    right=i;
                }
                if(ans<cnt){
                    ans=cnt;
                    ap=left+1;
                    as=n-right;
                }
                l=i;
            }
        }
        System.out.println(ap+" "+as);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)solve(sc);
    }
}

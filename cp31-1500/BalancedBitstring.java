import java.util.*;

public class BalancedBitstring {//1404A
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            char[] s=sc.next().toCharArray();

            boolean possible=true;

            for(int i=0;i<n-k;i++){
                if(s[i]=='?' && s[i+k]=='?') continue;

                if(s[i]=='?'){
                    s[i]=s[i+k];
                }else if(s[i+k]=='?'){
                    s[i+k]=s[i];
                }else if(s[i]!=s[i+k]){
                    possible=false;
                    break;
                }
            }

            if(!possible){
                System.out.println("NO");
                continue;
            }

            int zeros=0,ones=0;

            for(int i=0;i<k;i++){
                if(s[i]=='0') zeros++;
                else if(s[i]=='1') ones++;
            }

            if(zeros>k/2 || ones>k/2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
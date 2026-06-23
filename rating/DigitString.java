import java.util.*;

public class DigitString{//2230B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            String s=sc.next();
            int n=s.length();

            int[] right=new int[n+1];

            for(int i=n-1;i>=0;i--){
                right[i]=right[i+1];
                char c=s.charAt(i);
                if(c=='1'||c=='3') right[i]++;
            }

            int twos=0,keep=right[0];

            for(int i=0;i<n;i++){
                if(s.charAt(i)=='2') twos++;
                keep=Math.max(keep,twos+right[i+1]);
            }

            System.out.println(n-keep);
        }
    }
}
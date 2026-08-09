import java.util.*;

public class Evanescent {//2254B
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            int blocks=1;

            for(int i=1;i<n;i++){
                if(s.charAt(i)!=s.charAt(i-1))
                    blocks++;
            }

            int ans=blocks;

            for(int i=1;i<n-1;i++){
                int cur=0,next=0;

                if(s.charAt(i)!=s.charAt(i-1))
                    cur++;

                if(s.charAt(i)!=s.charAt(i+1))
                    cur++;

                if(s.charAt(i-1)!=s.charAt(i+1))
                    next=1;

                int value=blocks-cur+next;
                ans=Math.min(ans,value);
            }

            System.out.println(ans);
        }
    }
}
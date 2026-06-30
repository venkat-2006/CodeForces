import java.util.*;

public class RemovevomeR{//2241C

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            int changes=0;
            for(int i=1;i<n;i++)
                if(s.charAt(i)!=s.charAt(i-1))
                    changes++;

            System.out.println(changes==1?2:1);
        }
    }
}
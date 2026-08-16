import java.util.*;

public class Riptide {//2254A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            int ans=0;

            while(a!=b&&b!=c&&a!=c){
                int min=Math.min(a,Math.min(b,c));
                int max=Math.max(a,Math.max(b,c));

                if(a==min)a++;
                else if(b==min)b++;
                else c++;

                if(a==max)a--;
                else if(b==max)b--;
                else c--;

                ans++;
            }

            System.out.println(ans);
        }
    }
}
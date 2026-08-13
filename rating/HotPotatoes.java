import java.util.*;

public class HotPotatoes { // 2255A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            String s=sc.next();
            char[] a=s.toCharArray();
            int N=2*n;

            boolean[] move=new boolean[N];

            for(int i=0;i<N;i++)
                if(a[i]=='1' && a[(i+1)%N]=='0')
                    move[i]=true;

            for(int i=0;i<N;i++)
                if(move[i]) {
                    a[i]='0';
                    a[(i+1)%N]='1';
                }

            int red=0,blue=0;
            for(int i=0;i<N;i++)
                if(a[i]=='1') {
                    if(i%2==0) blue++;
                    else red++;
                }

            System.out.println(red+" "+blue);
        }
    }
}
import java.util.*;

public class MergeToMatch {//2248B
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            int[] a=new int[n],b=new int[m];

            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<m;i++) b[i]=sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);

            if(n<2*m){
                System.out.println("NO");
                continue;
            }

            int i=0;
            while(i<m && a[i]<b[i] && b[i]<a[n-m+i]) i++;

            System.out.println(i<m?"NO":"YES");
        }
    }
}
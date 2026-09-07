import java.util.*;

public class ChocolateBunny {//1407C
    static Scanner sc=new Scanner(System.in);

    static int ask(int x,int y){
        System.out.println("? "+(x+1)+" "+(y+1));
        System.out.flush();

        int z=sc.nextInt();

        if(z==-1)
            System.exit(0);

        return z;
    }

    public static void main(String[] args){
        int n=sc.nextInt();
        int[] ans=new int[n];

        int mx=0;

        for(int i=1;i<n;i++){
            int a=ask(mx,i);
            int b=ask(i,mx);

            if(a>b){
                ans[mx]=a;
                mx=i;
            }else{
                ans[i]=b;
            }
        }

        ans[mx]=n;

        System.out.print("! ");
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");

        System.out.println();
        System.out.flush();
    }
}
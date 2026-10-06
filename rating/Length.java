import java.util.*;

public class Length{//489C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int s=sc.nextInt();

        if(s==0){
            if(m==1)
                System.out.println("0 0");
            else
                System.out.println("-1 -1");
            return;
        }

        if(s>9*m){
            System.out.println("-1 -1");
            return;
        }

        int x=s;
        StringBuilder max=new StringBuilder();

        for(int i=0;i<m;i++){
            int d=Math.min(9,x);
            max.append(d);
            x-=d;
        }

        x=s;
        StringBuilder min=new StringBuilder();

        for(int i=0;i<m;i++){
            int d;

            if(i==0)
                d=Math.max(1,x-9*(m-1));
            else
                d=Math.max(0,x-9*(m-i-1));

            min.append(d);
            x-=d;
        }

        System.out.println(min+" "+max);
    }
}

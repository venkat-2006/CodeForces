import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {//791A
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        while(x<=y){
            x=x*3;
            y=y*2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}

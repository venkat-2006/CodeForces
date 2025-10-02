import java.util.*;
public class WrongSubtraction {//977A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(y-->0){
            if(x%10==0){
                x=x/10;
            }else{
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
    
}

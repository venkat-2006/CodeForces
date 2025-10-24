 import java.util.*;
 public class GameWithIntegers {//1899A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0){
            int a=sc.nextInt();
            if((a-1)%3==0||(a+1)%3==0){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
        sc.close();
    }
    
}

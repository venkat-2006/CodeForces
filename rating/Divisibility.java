import java.util.Scanner;

public class Divisibility {//1328A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if(x%y==0){
                System.out.println(0);
            }else{
            
            System.out.println(y-(x%y));
            }
        }

        sc.close();
    }
    
}

import java.util.Scanner;

public class Hulk {//705A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        int x=sc.nextInt();
        
        for(int i=1;i<=x;i++){
            
                if(i%2!=0){
                    System.out.print("I hate");
                    
                }else{
                    System.out.print("I love");
                    
                }
            
            if(i==x){
                System.out.print(" it");

            }else{
                System.out.print(" that ");
            }
        }
        sc.close();
    }
}

import java.util.*;
public class EvenOdds {//318A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();

        if(x%2!=0){
            if(y<=(x+1)/2){
                System.out.println(1+(y-1)*2);
            }else{
                System.out.println((y-(x+1)/2)*2);
            }
        }else{
            if(y<=x/2){
                System.out.println(1+(y-1)*2);
            }else{
                System.out.println((y-(x)/2)*2);
            }
        }
        
        sc.close();
    }
    
}

import java.util.*;
public class Accomodation {//467A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        while(x-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b-a>=2){
                count++;
            }

        }
        System.out.println(count);
        sc.close();
    }
    
}

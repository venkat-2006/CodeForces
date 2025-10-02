import java.util.*;
public class Tram {//116A :)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int max=0;
        int curr=0;
        while(x-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            curr+=b-a;
            max=Math.max(max,curr);
        }
        System.out.println(max);
        sc.close();
        
    }
    
}

import java.util.*;

public class StonesOnTheTable { //266A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String x=sc.next();
        x = x.substring(0, a);
        int count=0;
        int i=0;
        while(i<x.length()-1){
           
            if(x.charAt(i)==x.charAt(i+1)){
               count++;
            }
            i++;
        }
        System.out.println(count);
    }
    
}

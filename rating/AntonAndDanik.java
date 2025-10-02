import java.util.*;

public class AntonAndDanik {//734A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        String x=sc.next();
        int d=0;
        int a=0;
        int i=0;
        while(i<x.length()){
            if(x.charAt(i)=='A'){
                a++;
            }else{
                d++;
            }
            i++;
        }
        if(a==d){
            System.out.println("Friendship");
        }else if(a>d){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
        sc.close();
    }
    
}

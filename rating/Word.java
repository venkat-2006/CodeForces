import java.util.*;

public class Word {//59A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        int i=0;
        int lwr=0;
        int upr=0;
        while(i<x.length()){
            char c = x.charAt(i);
            if(Character.isLowerCase(c)){
                lwr++;
                i++;
            }else{
                upr++;
                i++;
            }

        }
        if(lwr<upr){
            System.out.println(x.toUpperCase());
        }else{
            System.out.println(x.toLowerCase());
        }

        sc.close();
    }
    
}

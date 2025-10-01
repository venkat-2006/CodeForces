import java.util.*;

public class WordCapitalization {  //281A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=x.substring(1);
        StringBuilder sb=new StringBuilder();
        String z= String.valueOf(Character.toUpperCase(x.charAt(0))); ///imp ***
        sb.append(z);
        sb.append(y);
        System.out.println(sb);
        sc.close();
    }
    
}

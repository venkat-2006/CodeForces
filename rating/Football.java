import java.util.*;
public class Football {
    public static void main(String[] args) {//96A
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        int count=1;
        int i=1;
        int max=1;
        while(i<x.length()){
            if(x.charAt(i-1)==x.charAt(i)){
                count++;
                max=Math.max(max,count);

            }else{
                count=1;

            }
            i++;
        }
        if(max>=7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



  
        sc.close();
    }
}

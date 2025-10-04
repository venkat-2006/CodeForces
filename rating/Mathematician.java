import java.util.Scanner;

public class Mathematician {//61A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<x.length()){
            if((x.charAt(i)=='0' && y.charAt(i)=='1')||(x.charAt(i)=='1' && y.charAt(i)=='0')){
                sb.append('1');
                i++;
            }else{
                sb.append('0');
                i++;
            }
        }
        System.out.println(sb);

        sc.close();
    }
    
}

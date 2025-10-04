import java.util.Scanner;

public class HQ9 {//133A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        boolean y=false;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='H'||x.charAt(i)=='Q'||x.charAt(i)=='9'){
                y=true;
                break;
            }
        }
        if(y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
        
    }
}

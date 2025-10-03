import java.util.*;

public class InSearch {//1030A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean z=true;
        while(x-->0){
            int a=sc.nextInt();
            if(a==1){
                z=false;
                break;

            }
        }
        if(z){
            System.out.println("EASY");
        }else{
            System.out.println("HARD");
        }


        sc.close();
    }
    
}

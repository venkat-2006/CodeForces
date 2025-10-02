import java.util.*;
public class VanyaAndFence{//677A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int res=0;
        while(x-->0){
            int z=sc.nextInt();
            if(z>y){
                res=res+2;
            }else{
                res++;
            }
        }
        System.out.println(res);
        sc.close();
        
    }
}
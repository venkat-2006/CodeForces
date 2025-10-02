import java.util.*;

public class SoldierAndBananas { //546A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int total=0;
        for(int i=1;i<=z;i++){
            total+=i*x;
        }
        if(total>y){
            System.out.println(total-y);

        }else{
            System.out.println(0);
        }
        

        sc.close();
    }
    
}

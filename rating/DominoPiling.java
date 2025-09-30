import java.util.*;
public class DominoPiling {//50A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int z=(int)Math.floor((x*y)/2);
        System.out.println(z);
        sc.close();
    }
    
}

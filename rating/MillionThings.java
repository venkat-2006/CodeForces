import java.util.*;
public class MillionThings{//2261C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),odd=0,even=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x%2==0) even++;
                else odd++;
            }
            System.out.println((odd==1&&even==1)||(odd==3&&even==0)?"Larpity":"Moggity");
        }
    }
}

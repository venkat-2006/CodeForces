 import java.util.*;
 public class DaytonaCost {//1878A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0){
            int z=sc.nextInt();
            int y=sc.nextInt();
            int arr[]=new int[z];
            for(int i=0;i<z;i++){
                arr[i]=sc.nextInt();
            }
            boolean ans=false;
            for(int i=0;i<z;i++){
                if(arr[i]==y){
                    ans=true;
                    break;
                }
            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
}

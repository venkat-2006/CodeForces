import java.util.*;
public class GoalsOfVictory {//1877A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0){
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a-1;i++){
                arr[i]=sc.nextInt();
            }
            int total=0;
            for(int i=0;i<a-1;i++){
                total+=arr[i];
            }
            System.out.println(total*(-1));
            
        }

        sc.close();
    }
    
}

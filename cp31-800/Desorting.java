import java.util.*;
public class Desorting {//1853A
    public static void main(String[] args) {// i liked this one <3
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0){
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }

            int min=Integer.MAX_VALUE;
            int min_index=0;
            boolean z=false;
            for(int i=0;i<a-1;i++){
                if(arr[i]>arr[i+1]){
                    z=true;
                    break;
                }
                if(arr[i+1]-arr[i]<min){
                    min=arr[i+1]-arr[i];
                    min_index=i;

                }
            }
            if(z){
                System.out.println(0);
            }else{
                System.out.println((min+2)/2);
            }
        }

        

        sc.close();
    }
    
}

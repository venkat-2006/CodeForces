import java.util.*;
public class Magnets {//344A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=1;
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();

        }
        for(int j=1;j<x;j++){
            if(arr[j]!=arr[j-1]){
                count++;

            }

        }
        System.out.println(count);

        sc.close();
    }
    
}

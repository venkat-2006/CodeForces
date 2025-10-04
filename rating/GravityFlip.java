import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {//405A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
    
}

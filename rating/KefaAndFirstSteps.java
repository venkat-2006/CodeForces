import java.util.Scanner;

public class KefaAndFirstSteps {//580A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int count=1;
        int max=0;
        while(i<x-1){
            if(arr[i]<=arr[i+1]){
                count++;
            }else{
                max=Math.max(max,count);
                count=1;
            }
            i++;

        }
        System.out.println(Math.max(max, count));

        sc.close();
    }
}

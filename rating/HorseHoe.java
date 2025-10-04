import java.util.*;
public class HorseHoe {//228A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long arr[]=new long[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        int i=0;
        int cnt=0;
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                cnt++;
                

            }
            i++;

        }
        System.out.println(cnt);



        sc.close();
        
        
    }
    
}


import java.util.*;

public class LineTrip {
    public static void main(String[] args) {// 1901A
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] = new int[a + 2];
            arr[0] = 0;
            arr[a + 1] = b;
            for (int i = 1; i < a + 1; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for (int i = 0; i < a ; i++) {
                if (arr[i + 1] - arr[i] > max) {
                    max = arr[i + 1] - arr[i];
                }
            }
            if(arr[1]*2>max){
                max=arr[1];

            }
            if((arr[a+1]-arr[a])*2>max){
                max=(arr[a+1]-arr[a])*2;

            }
            System.out.println(max);
        }

        sc.close();
    }

}

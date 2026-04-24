import java.util.*;

public class The67ThXorProblem { // 2218E
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int max = 0;

            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++){
                    int xor = arr[i] ^ arr[j];
                    if(xor > max){
                        max = xor;
                    }
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}
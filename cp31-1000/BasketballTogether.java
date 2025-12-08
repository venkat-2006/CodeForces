import java.util.*;

public class BasketballTogether {//1725B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int D = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left <= right) {

            int max = arr[right];

            int requiredPlayers = D / max + 1; 

            if ((right - left + 1) >= requiredPlayers) { 
                
                count++;
                right--;
                left += requiredPlayers - 1;
            } else {
                break;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

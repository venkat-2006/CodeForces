import java.util.*;

public class InterestingDrink { // 706B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            int a = sc.nextInt();

            int l = 0;
            int r = n;

            while(l < r){
                int mid = (l + r) / 2;

                if(arr[mid] <= a){
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }

            System.out.println(l);
        }
    }
}
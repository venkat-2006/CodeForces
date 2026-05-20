import java.util.*;

public class JourneyPlanning { //1320A
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Long> map = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int key = (i + 1) - arr[i]; 
            long sum = map.getOrDefault(key, 0L) + arr[i];
            map.put(key, sum);
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
        sc.close();
    }
}
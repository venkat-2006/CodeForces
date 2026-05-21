import java.util.*;

public class Tape { // 1110B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < n; i++) {
            pq.add(arr[i] - arr[i - 1] - 1);
        }

        int total = arr[n - 1] - arr[0] + 1;

        for (int i = 0; i < k - 1 && !pq.isEmpty(); i++) {
            total -= pq.poll();
        }

        System.out.println(total);

        sc.close();
    }
}
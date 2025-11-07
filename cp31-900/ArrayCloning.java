import java.util.*;

public class ArrayCloning { // 1665B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }

            int maxFreq = 0;
            for (int val : freq.values()) {
                maxFreq = Math.max(maxFreq, val);
            }

            int operations = 0;
            int current = maxFreq;

            while (current < n) {
                operations++; 
                int add = Math.min(current, n - current);
                operations += add; 
                current += add;
            }

            System.out.println(operations);
        }

        sc.close();
    }
}

import java.util.*;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of sequence b
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }

            List<Long> a = new ArrayList<>();
            a.add(b[0]); // Always add the first element

            for (int i = 1; i < n; i++) {
                if (b[i] >= b[i - 1]) {
                    a.add(b[i]); // Non-decreasing, add directly
                } else {
                    a.add(1L);   // Add a smaller number to simulate a drop
                    a.add(b[i]); // Then add current b[i]
                }
            }

            System.out.println(a.size()); // Output length of reconstructed sequence
            for (Long num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.*;

public class SubtractOperation {//1656B

    private static void solve(Scanner scanner) {
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        List<Long> v = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            v.add(scanner.nextLong());
        }

        Map<Long, Boolean> mp = new HashMap<>();
        for (Long it : v) {
            mp.put(it, true);
        }

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(v.get(i) - k)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
}

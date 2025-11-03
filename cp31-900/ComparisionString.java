import java.util.*;

public class ComparisionString { // 1837B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // length of string
            String s = sc.next(); // input string of '<' and '>'

            int longest = 1, current = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    current++;
                } else {
                    longest = Math.max(longest, current);
                    current = 1;
                }
            }

            longest = Math.max(longest, current);
            System.out.println(longest + 1);
        }
        sc.close();
    }
}

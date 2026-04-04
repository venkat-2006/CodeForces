import java.util.*;

public class TheSixtySeventhPermutationProblem { //2218C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = 1, r = 3 * n;

            StringBuilder res = new StringBuilder();

            for (int i = 0; i < n; i++) {
                res.append(l).append(" ");
                res.append(r - 1).append(" ");
                res.append(r).append(" ");
                l++;
                r -= 2;
            }

            System.out.println(res.toString());
        }
    }
}
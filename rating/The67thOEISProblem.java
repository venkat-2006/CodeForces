import java.util.*;

public class The67thOEISProblem { // 2218D

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                long val = (long) i * (i + 1);
                output.append(val).append(" ");
            }
            output.append("\n");
        }

        System.out.print(output);
    }
}
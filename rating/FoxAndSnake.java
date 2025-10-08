import java.util.*;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // odd rows -> all '#'
                for (int j = 0; j < m; j++)
                    System.out.print("#");
            } else if (i % 4 == 0) {
                // every 4th row -> '#' on left
                System.out.print("#");
                for (int j = 1; j < m; j++)
                    System.out.print(".");
            } else {
                // even rows not divisible by 4 -> '#' on right
                for (int j = 0; j < m - 1; j++)
                    System.out.print(".");
                System.out.print("#");
            }
            System.out.println();
        }

        sc.close();
    }
}

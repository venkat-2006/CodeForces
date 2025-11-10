import java.util.Scanner;

public class LuntikAndSubsequences {//1582B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int countZero = 0, countOne = 0;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == 0) countZero++;
                else if (val == 1) countOne++;
            }
            long result = countOne * (1L << countZero);
            System.out.println(result);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class MoveBrackets { // 1374C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int sum = 0;
            int ops = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    sum++;
                } else {
                    sum--;
                }

                if (sum < 0) {
                    ops++;
                    sum = 0;
                }
            }

            System.out.println(ops);
        }

        sc.close();
    }
}

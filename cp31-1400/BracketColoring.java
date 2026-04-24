import java.util.*;

public class BracketColoring {//1837D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int open = 0, close = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') open++;
                else close++;
            }

            if (open != close) {
                System.out.println(-1);
                continue;
            }

            if (isValid(s) || isValid(new StringBuilder(s).reverse().toString())) {
                System.out.println(1);
                for (int i = 0; i < n; i++) System.out.print("1 ");
                System.out.println();
                continue;
            }

            int[] color = new int[n];
            int balance = 0;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                if (c == '(') {
                    balance++;
                    if (balance > 0) color[i] = 1;
                    else color[i] = 2;
                } else {
                    if (balance > 0) color[i] = 1;
                    else color[i] = 2;
                    balance--;
                }
            }

            System.out.println(2);
            for (int i = 0; i < n; i++) System.out.print(color[i] + " ");
            System.out.println();
        }

        sc.close();
    }

    static boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
}
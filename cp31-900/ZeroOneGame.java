import java.util.Scanner;

public class ZeroOneGame { //1373B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x-- > 0) {
            String s = sc.next();
            int zeros = 0, ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') zeros++;
                else ones++;
            }
            int moves = Math.min(zeros, ones);
            if (moves % 2 == 1) System.out.println("DA");
            else System.out.println("NET");
        }
        sc.close();
    }
}

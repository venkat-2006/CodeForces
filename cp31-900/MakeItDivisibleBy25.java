import java.util.Scanner;

public class MakeItDivisibleBy25 {//1593B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int ans = n;

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '0') {
                    for (int j = i - 1; j >= 0; j--) {
                        if (s.charAt(j) == '0' || s.charAt(j) == '5') {
                            ans = Math.min(ans, n - j - 2);
                            break;
                        }
                    }
                }
                if (s.charAt(i) == '5') {
                    for (int j = i - 1; j >= 0; j--) {
                        if (s.charAt(j) == '2' || s.charAt(j) == '7') {
                            ans = Math.min(ans, n - j - 2);
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

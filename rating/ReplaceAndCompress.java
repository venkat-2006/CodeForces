import java.util.Scanner;

public class ReplaceAndCompress{//2276B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int ans = 1;

            if (s.contains("010") || s.contains("101")) {
                ans++;
            }

            if (s.contains("000") || s.contains("111")) {
                ans++;
            }

            System.out.println(ans);
        }
    }
}

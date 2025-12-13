import java.util.Scanner;

public class DoubleEndSTring { // 1506C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            int maxCommon = 0;
            int n = a.length();

            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String sub = a.substring(i, j);
                    if (b.contains(sub)) {
                        maxCommon = Math.max(maxCommon, sub.length());
                    }
                }
            }

            int result = (a.length() - maxCommon) + (b.length() - maxCommon);
            System.out.println(result);
        }

        sc.close();
    }
}

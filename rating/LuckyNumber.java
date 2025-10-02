import java.util.*;

public class LuckyNumber {//110A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        int luckyCount = 0;

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '4' || ch == '7') {
                luckyCount++;
            }
        }

        
        if (isLucky(luckyCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    static boolean isLucky(int num) {
        if (num == 0) return false;
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}

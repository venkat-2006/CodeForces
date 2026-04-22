import java.util.*;

public class AnnaandtheValentinesDayGift {//1931E
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long totalDigits = 0;
            List<Integer> zeros = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                String s = String.valueOf(x);
                totalDigits += s.length();

                int tz = 0;
                for (int j = s.length() - 1; j >= 0 && s.charAt(j) == '0'; j--) {
                    tz++;
                }
                zeros.add(tz);
            }
            zeros.sort(Collections.reverseOrder());

            long removed = 0;

            for (int i = 0; i < zeros.size(); i += 2) {
                removed += zeros.get(i);
            }

            long remainingDigits = totalDigits - removed;

            if (remainingDigits >= m + 1) {
                System.out.println("Sasha");
            } else {
                System.out.println("Anna");
            }
        }

        sc.close();
    }
}
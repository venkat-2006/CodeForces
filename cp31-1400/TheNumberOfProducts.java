import java.util.*;

public class TheNumberOfProducts { // 1215B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long positive = 0;
        long negative = 0;

        long evenPrefixes = 1;
        long oddPrefixes = 0;

        int parity = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < 0) {
                parity ^= 1; 
            }

            if (parity == 0) {
                positive += evenPrefixes;
                negative += oddPrefixes;
                evenPrefixes++;
            } else {
                positive += oddPrefixes;
                negative += evenPrefixes;
                oddPrefixes++;
            }
        }

        System.out.println(negative + " " + positive);

        sc.close();
    }
}
import java.util.*;

public class TargetPractice { // 1873C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int total = 0;

            for (int i = 0; i < 10; i++) {
                String row = sc.next();
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        
                        int ring = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j)) + 1;
                        total += ring;
                    }
                }
            }

            System.out.println(total);
        }

        sc.close();
    }
}

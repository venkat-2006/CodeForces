import java.util.*;

public class SumOfRoundNumbers {//1352A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();

            int place = 1; 
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNumbers.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }

            System.out.println(roundNumbers.size());
            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

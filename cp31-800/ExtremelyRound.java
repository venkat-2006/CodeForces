import java.util.*;

public class ExtremelyRound { //1766A
    static boolean check(long x) {
        long countOfDigits = 0, countOfZeroes = 0;
        while (x > 0) {
            if (x % 10 == 0) countOfZeroes++;
            countOfDigits++;
            x /= 10;
        }
        return countOfZeroes == countOfDigits - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> roundNumbers = new ArrayList<>();
        for (long i = 1; i <= 999999; i++) {
            if (check(i)) roundNumbers.add(i);
        }
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long answer = 0;
            for (long roundNumber : roundNumbers) {
                if (roundNumber <= n) answer++;
                else break;
            }
            System.out.println(answer);
        }
        scanner.close();
    }
}
// import java.util.*;

// public class ExtremelyRound { //1766A //liked this one than brute force
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int digits = String.valueOf(n).length();
//             int first = n / (int) Math.pow(10, digits - 1);
//             System.out.println((digits - 1) * 9 + first);
//         }
//         sc.close();
//     }
// }

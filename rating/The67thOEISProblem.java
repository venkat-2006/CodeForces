import java.util.*;

public class The67thOEISProblem { // 2218D

    static List<Long> primes = new ArrayList<>();

    static void generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add((long) i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        generatePrimes(200000);

        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                long val = primes.get(i) * primes.get(i + 1);
                output.append(val).append(" ");
            }
            output.append("\n");
        }

        System.out.print(output);
    }
}
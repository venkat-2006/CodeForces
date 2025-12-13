import java.util.Scanner;

public class DifferentDivisors { // 1474B

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int nextPrime(int start) {
        while (!isPrime(start)) {
            start++;
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int d = sc.nextInt();

            int p = nextPrime(d + 1);
            int q = nextPrime(p + d);

            System.out.println((long) p * q);
        }

        sc.close();
    }
}

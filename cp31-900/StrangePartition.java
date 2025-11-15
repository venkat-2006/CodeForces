import java.util.Scanner;

public class StrangePartition { //1471A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {
            long n = sc.nextLong();
            long divisor = sc.nextLong();

            long sum = 0;
            long maxBeauty = 0;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                sum += a;
                maxBeauty += (a + divisor - 1) / divisor; 
            }

            long minBeauty = (sum + divisor - 1) / divisor;

            System.out.println(minBeauty + " " + maxBeauty);
        }

        sc.close();
    }
}

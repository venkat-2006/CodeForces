import java.util.*;

public class StoneAgeProblem {//1679B

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] arr = new long[n];
        int[] version = new int[n];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }

        long globalValue = 0;
        int currentVersion = 0;

        while (q-- > 0) {

            int t = sc.nextInt();

            if (t == 1) {

                int i = sc.nextInt() - 1;
                long x = sc.nextLong();

                if (version[i] == currentVersion) {
                    sum -= arr[i];
                } else {
                    sum -= globalValue;
                }

                arr[i] = x;
                version[i] = currentVersion;
                sum += x;

            } else {

                long x = sc.nextLong();

                globalValue = x;
                currentVersion++;
                sum = n * x;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}

import java.util.*;

public class AddMoulo10 { // 1714E
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean hasZero = false;

           
            for (int i = 0; i < n; i++) {
                if (arr[i] % 10 == 5) {
                    arr[i] += 5;
                }
                if (arr[i] % 10 == 0) {
                    hasZero = true;
                }
            }

            if (hasZero) {
                boolean ok = true;
                int target = arr[0];

                for (int x : arr) {
                    if (x != target) {
                        ok = false;
                        break;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            } else {

                for (int i = 0; i < n; i++) {
                    while (arr[i] % 10 != 2) {
                        arr[i] += arr[i] % 10;
                    }
                }

                boolean ok = true;
                int mod = arr[0] % 20;

                for (int x : arr) {
                    if (x % 20 != mod) {
                        ok = false;
                        break;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            }
        }

        sc.close();
    }
}
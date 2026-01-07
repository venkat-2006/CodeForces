import java.util.*;
public class Aquarium {//1873E

   static boolean heightCheck(long[] arr, int mid, long b) {
        long temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mid) {
                temp += mid - arr[i];
            }
        }
        return b >= temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {
            int a = sc.nextInt();
            long b = sc.nextLong();

            long arr[] = new long[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextLong();
            }

            int st = 1;
            int end = 1000000000;
            int ans = -1;

            while (st <= end) {
                int mid = (st + end) / 2;

                if (heightCheck(arr, mid, b)) {
                    ans = mid;
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}

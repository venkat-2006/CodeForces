import java.util.*;

public class YetAnotherProblemAboutPairs { //1703F

    static int lowerBound(ArrayList<Integer> arr, int target) {
        int left = 0, right = arr.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr.get(mid) < target)
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            long ans = 0;
            ArrayList<Integer> valid = new ArrayList<>();

            for (int j = 1; j <= n; j++) {

                if (a[j] < j) {

                    int count = lowerBound(valid, a[j]);
                    ans += count;

                    valid.add(j);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
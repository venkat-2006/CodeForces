import java.util.*;

public class TrianglesOnRectangle {//1620B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long w = sc.nextLong();
            long h = sc.nextLong();

            long maxArea = 0;

            int k = sc.nextInt();
            long[] arr = new long[k];
            for (int i = 0; i < k; i++) arr[i] = sc.nextLong();
            maxArea = Math.max(maxArea, (arr[k - 1] - arr[0]) * h);

            k = sc.nextInt();
            arr = new long[k];
            for (int i = 0; i < k; i++) arr[i] = sc.nextLong();
            maxArea = Math.max(maxArea, (arr[k - 1] - arr[0]) * h);

            k = sc.nextInt();
            arr = new long[k];
            for (int i = 0; i < k; i++) arr[i] = sc.nextLong();
            maxArea = Math.max(maxArea, (arr[k - 1] - arr[0]) * w);

            k = sc.nextInt();
            arr = new long[k];
            for (int i = 0; i < k; i++) arr[i] = sc.nextLong();
            maxArea = Math.max(maxArea, (arr[k - 1] - arr[0]) * w);

            System.out.println(maxArea);
        }
    }
}

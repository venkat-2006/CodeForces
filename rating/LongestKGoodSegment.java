import java.util.*;

public class LongestKGoodSegment {//616D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int bestLeft = 0;
        int bestRight = 0;

        for (int right = 0; right < n; right++) {

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

          
            if (right - left > bestRight - bestLeft) {
                bestLeft = left;
                bestRight = right;
            }
        }

        
        System.out.println((bestLeft + 1) + " " + (bestRight + 1));
    }
}
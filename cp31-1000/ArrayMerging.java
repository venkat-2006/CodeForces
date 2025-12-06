import java.util.Scanner;
import java.util.HashMap;

public class ArrayMerging { // 1831B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();

            HashMap<Integer, Integer> bestA = new HashMap<>();
            HashMap<Integer, Integer> bestB = new HashMap<>();

            int count = 1;
            for(int i = 1; i < n; i++){
                if(a[i] == a[i-1]) count++;
                else count = 1;

                bestA.put(a[i], Math.max(bestA.getOrDefault(a[i], 1), count));
            }
            bestA.put(a[0], Math.max(bestA.getOrDefault(a[0], 1), 1));

            count = 1;
            for(int i = 1; i < n; i++){
                if(b[i] == b[i-1]) count++;
                else count = 1;

                bestB.put(b[i], Math.max(bestB.getOrDefault(b[i], 1), count));
            }
            bestB.put(b[0], Math.max(bestB.getOrDefault(b[0], 1), 1));

            int ans = 1;
            for(int key : bestA.keySet()){
                ans = Math.max(ans, bestA.get(key) + bestB.getOrDefault(key, 0));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

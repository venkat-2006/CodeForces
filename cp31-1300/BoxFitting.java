import java.util.*;

public class BoxFitting { // 1498B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int W = sc.nextInt();

            int[] cnt = new int[21];

            for (int i = 0; i < n; i++) {
                int w = sc.nextInt();
                int p = Integer.numberOfTrailingZeros(w);
                cnt[p]++;
            }

            int height = 0;

            
            while (true) {
                int remaining = W;
                boolean placed = false;

               
                for (int i = 20; i >= 0; i--) {
                    int size = 1 << i;

                    int canTake = Math.min(cnt[i], remaining / size);

                    if (canTake > 0) {
                        cnt[i] -= canTake;
                        remaining -= canTake * size;
                        placed = true;
                    }
                }

               
                if (!placed) break;

                height++;
            }

            System.out.println(height);
        }
    }
}
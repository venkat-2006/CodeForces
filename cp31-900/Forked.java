import java.util.Scanner;
import java.util.HashSet;
 
public class Forked {
    // possible move directions (used for generating attack positions)
    static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long xK = sc.nextLong(), yK = sc.nextLong();
            long xQ = sc.nextLong(), yQ = sc.nextLong();
 
            // HashSets to store all cells attacked by the knight
            HashSet<String> kingHits = new HashSet<>();
            HashSet<String> queenHits = new HashSet<>();
 
            for (int j = 0; j < 4; j++) {
                // add positions that can attack the king
                kingHits.add((xK + dx[j] * a) + "_" + (yK + dy[j] * b));
                kingHits.add((xK + dx[j] * b) + "_" + (yK + dy[j] * a));
 
                // add positions that can attack the queen
                queenHits.add((xQ + dx[j] * a) + "_" + (yQ + dy[j] * b));
                queenHits.add((xQ + dx[j] * b) + "_" + (yQ + dy[j] * a));
            }
 
            int count = 0;
            // count common positions
            for (String pos : kingHits) {
                if (queenHits.contains(pos)) {
                    count++;
                }
            }
 
            System.out.println(count);
        }
 
        sc.close();
    }
}
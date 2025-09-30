import java.util.*;

public class NextRound {  // 158A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of participants
        int k = sc.nextInt();  // position of participant that sets cutoff
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int cutoff = scores[k - 1]; // score of k-th contestant (1-based index)
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] > 0 && scores[i] >= cutoff) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

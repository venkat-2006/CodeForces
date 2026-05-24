import java.util.*;

public class ArrangingTheSheep {//1520E
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            ArrayList<Integer> pos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '*') {
                    pos.add(i);
                }
            }

            int k = pos.size();

            if (k <= 1) {
                System.out.println(0);
                continue;
            }

            int mid = k / 2;
            int medianPos = pos.get(mid);

            long ans = 0;

            int start = medianPos - mid;

            for (int i = 0; i < k; i++) {
                int target = start + i;
                ans += Math.abs(pos.get(i) - target);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
import java.util.*;

public class Forked {//1904A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xK = sc.nextInt();
            int yK = sc.nextInt();

            int xQ = sc.nextInt();
            int yQ = sc.nextInt();

            // 8 possible knight moves
            int[] dx = {a, a, -a, -a, b, b, -b, -b};
            int[] dy = {b, -b, b, -b, a, -a, a, -a};

            // store all 8 positions that can attack the king
            int[][] king = new int[8][2];
            for (int i = 0; i < 8; i++) {
                king[i][0] = xK + dx[i];
                king[i][1] = yK + dy[i];
            }

            int count = 0;
            // check all 8 positions that can attack the queen
            for (int i = 0; i < 8; i++) {
                int x = xQ + dx[i];
                int y = yQ + dy[i];

                // compare with each king position
                for (int j = 0; j < 8; j++) {
                    if (x == king[j][0] && y == king[j][1]) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}

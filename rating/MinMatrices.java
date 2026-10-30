import java.util.Scanner;

public class MinMatrices{//2263B
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = k - n + 1;
        
        if (!(1 <= x && x <= n)) { 
            System.out.print(-1); 
            return; 
        }
        
        int[][] ans = new int[n][n];
        ans[0][0] = 1;
        int on = 2;
        
        for (int i = 1; i < x; i++) {
            ans[0][i] = on; on++;
            ans[i][0] = on; on++;
        }
        
        for (int i = x; i < n; i++) {
            ans[i][i] = on; on++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 0) {
                    ans[i][j] = on; on++;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (j > 0) System.out.print("\n");
            for (int i = 0; i < n; i++) {
                System.out.print(ans[j][i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            solve(sc);
            if (t > 0) System.out.print("\n");
        }
        sc.close();
    }
}

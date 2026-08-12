import java.util.*;

public class SayNoToPalindromes {//1555D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        String[] p = {"abc","acb","bac","bca","cab","cba"};
        int[][] pre = new int[6][n + 1];

        for(int k=0;k<6;k++) {
            for(int i=0;i<n;i++) {
                pre[k][i+1] = pre[k][i] + (s.charAt(i) != p[k].charAt(i%3) ? 1 : 0);
            }
        }

        while(m-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = Integer.MAX_VALUE;

            for(int k=0;k<6;k++) {
                ans = Math.min(ans, pre[k][r] - pre[k][l-1]);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class LiHuaAndPattern {//1797B //TLE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            
            int cnt = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] != arr[n - i - 1][n - j - 1]) {
                        cnt++;
                    }
                }
            }
            
            cnt /= 2;
            
            if (cnt > k) {
                System.out.println("NO");
            } else {
                int remaining = k - cnt;
                
                if (remaining % 2 == 0) {
                    System.out.println("YES");
                } else {
                    if (n % 2 == 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
        
        scanner.close();
    }
}
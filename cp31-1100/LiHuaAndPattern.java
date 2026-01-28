// import java.util.Scanner;

// public class LiHuaAndPattern {//1797B //TLE
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt();
        
//         while (t-- > 0) {
//             int n = scanner.nextInt();
//             int k = scanner.nextInt();
//             int[][] arr = new int[n][n];
            
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     arr[i][j] = scanner.nextInt();
//                 }
//             }
            
//             int cnt = 0;
            
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     if (arr[i][j] != arr[n - i - 1][n - j - 1]) {
//                         cnt++;
//                     }
//                 }
//             }
            
//             cnt /= 2;
            
//             if (cnt > k) {
//                 System.out.println("NO");
//             } else {
//                 int remaining = k - cnt;
                
//                 if (remaining % 2 == 0) {
//                     System.out.println("YES");
//                 } else {
//                     if (n % 2 == 0) {
//                         System.out.println("NO");
//                     } else {
//                         System.out.println("YES");
//                     }
//                 }
//             }
//         }
        
//         scanner.close();
//     }
// }
import java.util.*;
import java.io.*;

public class LiHuaAndPattern {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            long diff = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[n - 1 - i][n - 1 - j]) {
                        diff++;
                    }
                }
            }
            
            // Each mismatch is counted twice (a[i][j] and a[n-1-i][n-1-j])
            diff /= 2;

            if (diff <= k && ((k - diff) % 2 == 0 || n % 2 != 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Fast I/O to avoid TLE
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

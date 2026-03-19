// import java.util.*;

// public class StrangeBirthday { //1470A
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         while (t-- > 0) {

//             int n = sc.nextInt();
//             int m = sc.nextInt();

//             int[] k = new int[n];
//             for (int i = 0; i < n; i++) k[i] = sc.nextInt();

//             long[] c = new long[m];
//             for (int i = 0; i < m; i++) c[i] = sc.nextLong();

//             Arrays.sort(k);

//             long ans = 0;
//             int ptr = 0;

//             for (int i = n - 1; i >= 0; i--) {
//                 if (ptr < k[i]) {
//                     ans += c[ptr];
//                     ptr++;
//                 } else {
//                     ans += c[k[i] - 1];
//                 }
//             }

//             System.out.println(ans);
//         }

//         sc.close();
//     }
// }//TLEEEEEEEEEEEEEEEEEEEEEEEEE
import java.io.*;
import java.util.*;

public class StrangeBirthday {//1470A
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] k = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) k[i] = Integer.parseInt(st.nextToken());

            long[] c = new long[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) c[i] = Long.parseLong(st.nextToken());

            Arrays.sort(k);

            long ans = 0;
            int ptr = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (ptr < k[i]) {
                    ans += c[ptr];
                    ptr++;
                } else {
                    ans += c[k[i] - 1];
                }
            }

            output.append(ans).append('\n');
        }

        System.out.print(output);
    }
}
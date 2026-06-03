import java.io.*;
import java.util.*;

public class ChipmunkTheoAndEquality {//2231C

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            HashMap<Integer, Integer> cnt1 = new HashMap<>();
            HashMap<Integer, Long> cnt2 = new HashMap<>();

            int x = a[0];

            HashSet<Integer> s = new HashSet<>();
            long c = 0;

            while (!s.contains(x)) {

                cnt1.put(x, 1);
                cnt2.put(x, c);

                s.add(x);

                if ((x & 1) == 1) {
                    x++;
                } else {
                    x >>= 1;
                }

                c++;
            }

            for (int i = 1; i < n; i++) {

                x = a[i];
                s.clear();
                c = 0;

                while (!s.contains(x)) {

                    if (cnt1.containsKey(x)) {
                        cnt1.put(x, cnt1.get(x) + 1);
                        cnt2.put(x, cnt2.get(x) + c);
                    }

                    s.add(x);

                    if ((x & 1) == 1) {
                        x++;
                    } else {
                        x >>= 1;
                    }

                    c++;
                }
            }

            long ans = (long) 1e18;

            for (Map.Entry<Integer, Integer> entry : cnt1.entrySet()) {

                int key = entry.getKey();
                int value = entry.getValue();

                if (value == n) {
                    ans = Math.min(ans, cnt2.get(key));
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
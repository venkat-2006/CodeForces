import java.util.*;

public class DidntGo {//2275B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] printed = new boolean[n + 1];
            Stack<Integer> st = new Stack<>();

            for (int i = 1; i <= n; i++) {
                char c = s.charAt(i - 1);

                if (c == '1') {
                    st.push(i);
                } else if (c == '2') {
                    if (!st.isEmpty()) {
                        printed[st.pop()] = true;
                    } else {
                        printed[i] = true;
                    }
                } else {
                    printed[i] = true;
                }
            }

            int count = 0;
            StringBuilder ans = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    if (count > 0) ans.append(" ");
                    ans.append(i);
                    count++;
                }
            }

            System.out.println(count);
            System.out.println(ans);
        }
    }
}

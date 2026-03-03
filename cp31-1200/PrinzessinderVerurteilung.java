import java.util.*;

public class PrinzessinderVerurteilung {//1536B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<String> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(s.substring(i, i + 1));
                if (i + 2 <= n) set.add(s.substring(i, i + 2));
                if (i + 3 <= n) set.add(s.substring(i, i + 3));
            }

            boolean found = false;

            for (char c = 'a'; c <= 'z'; c++) {
                String str = String.valueOf(c);
                if (!set.contains(str)) {
                    System.out.println(str);
                    found = true;
                    break;
                }
            }

            if (found) continue;

            for (char c1 = 'a'; c1 <= 'z'; c1++) {
                for (char c2 = 'a'; c2 <= 'z'; c2++) {
                    String str = "" + c1 + c2;
                    if (!set.contains(str)) {
                        System.out.println(str);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (found) continue;

            for (char c1 = 'a'; c1 <= 'z'; c1++) {
                for (char c2 = 'a'; c2 <= 'z'; c2++) {
                    for (char c3 = 'a'; c3 <= 'z'; c3++) {
                        String str = "" + c1 + c2 + c3;
                        if (!set.contains(str)) {
                            System.out.println(str);
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }
        }
        sc.close();
    }
}
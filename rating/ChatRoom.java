import java.util.*;

public class ChatRoom {
    public static void main(String[] args) { // 58A
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        String target = "hello";
        int j = 0; 

        for (char ch : x.toCharArray()) {
            if (ch == target.charAt(j)) {
                j++;
                if (j == target.length()) break; 
            }
        }

        if (j == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

import java.util.*;

public class ABBalance {//1606A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.nextLine();
            int ab = 0, ba = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') ab++;
                else if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') ba++;
            }
            char[] arr = s.toCharArray();
            if (ab > ba && arr[arr.length - 1] == 'b') arr[arr.length - 1] = 'a';
            else if (ba > ab && arr[arr.length - 1] == 'a') arr[arr.length - 1] = 'b';
            System.out.println(new String(arr));
        }
        sc.close();
    }
}

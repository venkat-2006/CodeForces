import java.util.*;

public class SwapAndDelete {//1913B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            int zero = 0, one = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '0') zero++;
                else one++;
            }
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') zero--;
                else one--;
                
                if (zero == one) {
                    System.out.println(zero + one);
                    break;
                }
            }
        }
    }
}

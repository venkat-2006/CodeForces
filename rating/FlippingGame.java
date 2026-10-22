import java.util.*;
public class FlippingGame{//327A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ones = 0, cur = 0, max = -1;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) ones++;
            cur = Math.max(0, cur) + (x == 0 ? 1 : -1);
            max = Math.max(max, cur);
        }
        System.out.println(ones + max);
    }
}

import java.util.*;

public class Controllers { //1776L
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        int q = sc.nextInt();
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '+') {
                pos++;
            } else {
                neg++;
            }
        }

        while (q-- > 0) {
        long a = sc.nextLong();
        long b = sc.nextLong();
            if (a == b) {
                if (pos == neg) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            long num = 1L * (neg - pos) * b;
            long den = a - b;

            if (num % den != 0) {
                System.out.println("NO");
            } else {
               long d=num/den;
               if(d>=-neg && d<=pos){
                   System.out.println("YES");
               }else{
                   System.out.println("NO");
               }
            }
        }

        sc.close();
    }
}
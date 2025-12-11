import java.util.*;

public class RoofConstruction {
    public static void main(String[] args) {//1632B
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            n--;

            int msb = 31 - Integer.numberOfLeadingZeros(n);
            int start = 1 << msb;
            int end = start - 1;

            for (int i = end; i >= 0; i--) System.out.print(i + " ");
            for (int i = start; i <= n; i++) System.out.print(i + " ");

            System.out.println();
        }
    }
}

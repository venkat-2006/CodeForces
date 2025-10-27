import java.util.*;
public class UnitArray { // 1834A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int count1 = 0, count2 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) count1++;
                else count2++;
            }

            int res = 0;

            
            while (count1 < count2) {
                count1++;
                count2--;
                res++;
            }

            
            if ((count2 % 2) == 1) res++;

            System.out.println(res);
        }

        sc.close();
    }
}

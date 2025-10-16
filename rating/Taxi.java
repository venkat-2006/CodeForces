import java.util.*;

public class Taxi {//158B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = sc.nextInt();
        Arrays.sort(s);
        int i = 0, j = n - 1, taxis = 0;
        while (i <= j) {
            int sum = s[j--];
            while (i <= j && sum + s[i] <= 4) sum += s[i++];
            taxis++;
        }
        System.out.println(taxis);
    }
}

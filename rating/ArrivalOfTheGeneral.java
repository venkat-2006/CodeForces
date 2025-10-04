import java.util.*;

public class ArrivalOfTheGeneral {//144A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int maxVal = -1, maxIdx = -1;
        int minVal = 101, minIdx = -1;
        
       
        for (int i = 0; i < n; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
                maxIdx = i;
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            if (a[i] <= minVal) {
                minVal = a[i];
                minIdx = i;
            }
        }
        
        int moves = maxIdx + (n - 1 - minIdx);
        if (maxIdx > minIdx) moves--; // overlap
        
        System.out.println(moves);
        
        sc.close();
    }
}

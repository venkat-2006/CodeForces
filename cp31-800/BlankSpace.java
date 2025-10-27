import java.util.*;

public class BlankSpace {//1829B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxBlank = 0;
            int current = 0; 

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    current++;
                    maxBlank = Math.max(maxBlank, current);
                } else {
                    current = 0; 
                }
            }

            System.out.println(maxBlank);
        }

        sc.close();
    }
}

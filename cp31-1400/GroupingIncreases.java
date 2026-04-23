import java.util.*;

public class GroupingIncreases { // 1919C
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int last_s = Integer.MAX_VALUE;
            int last_t = Integer.MAX_VALUE;
            int penalty = 0;

            for (int x : arr) {

               
                if (last_s >= x && last_t >= x) {
                    if (last_s < last_t) {
                        last_s = x;
                    } else {
                        last_t = x;
                    }
                }

              
                else if (last_s >= x) {
                    last_s = x;
                }

                else if (last_t >= x) {
                    last_t = x;
                }

                
                else {
                    penalty++;

                    if (last_s < last_t) {
                        last_s = x;
                    } else {
                        last_t = x;
                    }
                }
            }

            System.out.println(penalty);
        }

        sc.close();
    }
}
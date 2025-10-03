import java.util.*;

public class Queue {
    public static void main(String[] args) { // 266B
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of children
        int t = sc.nextInt(); // number of seconds
        String s = sc.next(); // initial arrangement

        char[] arr = s.toCharArray();

       
        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    
                    i++;
                }
            }
        }

        System.out.println(new String(arr));

        sc.close();
    }
}

import java.util.*;

public class BinaryArrayGame{//2183A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int s = 0; 

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) s++;
            }

            if (arr[0] == 0 && arr[n - 1] == 1)
                System.out.println("Alice");

            else if (arr[0] == 1 && arr[n - 1] == 0)
                System.out.println("Alice");

            else if (s == n) 
                System.out.println("Alice");

            else if (arr[0] == 1 && arr[n - 1] == 1 && s < n)
                System.out.println("Alice");

            else
                System.out.println("Bob");
        }

        sc.close();
    }
}

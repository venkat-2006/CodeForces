import java.util.*;

public class Presents {
    public static void main(String[] args) {//136A
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];

       
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < x; i++) {
            int z = findIndex(arr, x, i + 1); 
            System.out.print(z + " ");
        }

        sc.close();
    }

    static int findIndex(int[] arr, int x, int value) {
        for (int i = 0; i < x; i++) {
            if (arr[i] == value) {
                return i + 1; 
            }
        }
        return -1; 
    }
}

// import java.util.*;

// public class Twins { // 160A
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int arr[] = new int[x];

//         for (int i = 0; i < x; i++) {
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr); 

//         int last = arr.length - 1;
//         int secondLast = last - 1;
//         int res = 0;

//         while (secondLast >= 0) {
//             int total = 0;
//             int secondTotal = 0;

           
//             for (int i = last; i > secondLast; i--) {
//                 total += arr[i];
//             }

           
//             for (int i = 0; i <= secondLast; i++) {
//                 secondTotal += arr[i];
//             }

//             if (total > secondTotal) {
//                 res = last - secondLast;
//                 break;
//             }

//             secondLast--;
//         }

//         System.out.println(res);
//         sc.close();
//     }
// }
import java.util.*;

public class Twins {//160A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int totalSum = 0;
        for (int coin : arr) totalSum += coin;

        int chosenSum = 0;
        int res = 0;

        for (int i = n - 1; i >= 0; i--) {
            chosenSum += arr[i];
            totalSum -= arr[i];
            res++;
            if (chosenSum > totalSum) {
                break;
            }
        }

        System.out.println(res);
        sc.close();
    }
}

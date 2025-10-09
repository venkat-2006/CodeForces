import java.util.Scanner;

public class EvennessFinder {//25A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

       
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

       
        int[] parities = new int[3];
        for (int i = 0; i < 3; i++) {
            parities[i] = numbers[i] % 2;
        }

        int majorityParity = (parities[0] + parities[1] + parities[2] >= 2) ? 1 : 0;

       
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != majorityParity) {
                System.out.println(i + 1); 
                break;
            }
        }

        sc.close();
    }
}

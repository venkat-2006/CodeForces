import java.util.*;

class Person {
    int a, b;
    Person(int a, int b){
        this.a = a;  
        this.b = b;  
    }
}

public class Helmets {//1876A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int p = sc.nextInt();

            Person[] arr = new Person[n];

            for (int i = 0; i < n; i++) {
                int ai = sc.nextInt();
                arr[i] = new Person(ai, 0);
            }
            for (int i = 0; i < n; i++) {
                arr[i].b = sc.nextInt();
            }

           
            Arrays.sort(arr, (x, y) -> x.b - y.b);

            long cost = 0;
            int informed = 0;

            for (int i = 0; i < n && informed < n; i++) {

                cost += p; 
                informed++;

                int share = Math.min(arr[i].a, n - informed);
                cost += (long) share * arr[i].b;
                informed += share;
            }

            System.out.println(cost);
        }
        sc.close();
    }
}

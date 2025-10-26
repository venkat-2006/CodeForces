import java.util.*;
public class ForbiddenInteger { // 1845A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int z = 0;
            int count = 0;
            boolean ans = true;
            List<Integer> result = new ArrayList<>();

            while (a - z > 0 && b > 0) { 
                if (a / b > 0 && b != c) {
                    int times = a / b;
                    z += times * b;
                    count += times;
                    for (int i = 0; i < times; i++) {
                        result.add(b);
                    }
                }
                b--;

                
                if (z >= a) break;
            }

           
            int rem = a - z;
            if (rem > 0) {
                if (rem == c) ans = false;
                else {
                    result.add(rem);
                    count++;
                }
            }

           
            if (a - z == 1 && c == 1) ans = false;

            if (ans && z + (a - z) == a) {
                System.out.println("YES");
                System.out.println(count);
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(result.get(i) + " ");
                }
                System.out.println(); 
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

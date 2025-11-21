import java.util.Scanner;

public class MinimumLCM { //1765M
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();   

        while (x-- > 0) {

            long n = sc.nextLong();  

            long ans_a = 1;
            long ans_b = n - 1;

           
            for (long fac = 2; fac * fac <= n; fac++) {

                if (n % fac == 0) {     

                    ans_a = n / fac;    
                    ans_b = n - ans_a;   
                    break;                
                }
            }

            System.out.println(ans_a + " " + ans_b);
        }

        sc.close();
    }
}

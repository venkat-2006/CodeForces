    import java.util.*;

    public class ElephantSteps {//617A
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int x = sc.nextInt();  // friend's house 
            
            int steps = x / 5;
            if (x % 5 != 0) steps++; // if remainder exists, oka extra step vestam as it will be max
            
            System.out.println(steps);
            
            sc.close();
        }
    }

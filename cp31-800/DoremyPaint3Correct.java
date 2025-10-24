import java.util.*;

public class DoremyPaint3Correct {//1890A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if(freq.size() == 1){
                System.out.println("Yes");
            } else if(freq.size() > 2){
                System.out.println("No");
            } else {
                
                Iterator<Integer> it = freq.values().iterator();
                int c1 = it.next();
                int c2 = it.next();
                if(Math.abs(c1 - c2) <= 1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        sc.close();
    }
}

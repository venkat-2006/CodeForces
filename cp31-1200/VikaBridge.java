import java.util.*;

public class VikaBridge { // 1848B
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            List<List<Integer>> pos = new ArrayList<>();
            for (int i = 0; i <= k; i++) {
                pos.add(new ArrayList<>());
            }
            
            for (int i = 1; i <= n; i++) {
                int c = sc.nextInt();
                pos.get(c).add(i);
            }
            
            int answer = Integer.MAX_VALUE;
            
            for (int color = 1; color <= k; color++) {
                if (pos.get(color).isEmpty()) continue;
                
                int largest = 0;
                int secondLargest = 0;
                int prev = 0;
                
                for (int p : pos.get(color)) {
                    int gap = p - prev - 1;
                    
                    if (gap > largest) {
                        secondLargest = largest;
                        largest = gap;
                    } else if (gap > secondLargest) {
                        secondLargest = gap;
                    }
                    
                    prev = p;
                }
                
                int lastGap = n - prev;
                
                if (lastGap > largest) {
                    secondLargest = largest;
                    largest = lastGap;
                } else if (lastGap > secondLargest) {
                    secondLargest = lastGap;
                }
                
                int best = Math.max(secondLargest, (largest + 1) / 2);
                answer = Math.min(answer, best);
            }
            
            System.out.println(answer);
        }
        
        sc.close();
    }
}
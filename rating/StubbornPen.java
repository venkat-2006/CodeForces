import java.util.Scanner;

public class StubbornPen{//2290B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            char pen = 'R';
            int switches = 0;
            
            for (int i = 0; i < n; i++) {
                char letter = s.charAt(i);
                
                if (pen != letter) {
                    switches++;
                }
                
                if (letter == 'R') {
                    pen = 'B';
                } else {
                    pen = 'R';
                }
            }
            
            System.out.println(switches);
            t--;
        }
        
        sc.close();
    }
}

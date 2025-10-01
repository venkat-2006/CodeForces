import java.util.*;

public class PetyaAndStrings { //112A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next().toLowerCase();
        String y = sc.next().toLowerCase();

        if (x.equals(y)) {
            System.out.println(0);
        } else {
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) < y.charAt(i)) {
                    System.out.println(-1);
                    return;  
                } else if (x.charAt(i) > y.charAt(i)) {
                    System.out.println(1);
                    return; 
                }
            }
        }

        sc.close();
    }
}

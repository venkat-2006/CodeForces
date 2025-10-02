import java.util.*;

public class BeautifulYear { // 271A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        while (true) {
            y++; 
            if (hasDistinctDigits(y)) {
                System.out.println(y);
                break;
            }
        }

        sc.close();
    }

    
    static boolean hasDistinctDigits(int year) {
        String s = Integer.toString(year);
        Set<Character> digits = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!digits.add(c)) {
                return false; // duplicate dorkindii!!!
            }
        }
        return true;
    }
}

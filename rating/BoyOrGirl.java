import java.util.*;

public class BoyOrGirl {   //236A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        // HashSet to store distinct characters
        HashSet<Character> set = new HashSet<>();

        for (char c : x.toCharArray()) {
            set.add(c); //unique values
        }

        // Check even or odd size
        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}

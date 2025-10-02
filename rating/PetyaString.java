import java.util.*;

public class PetyaString {
    public static void main(String[] args) {//118A
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String vowels = "aoyeuiAOYEUI";
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) == -1) { // not a vowel
                result.append(".");
                result.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(result);
    }
}

import java.util.*;

public class AntonAndLetters {//443A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Set<Character> letters = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        System.out.println(letters.size());
        sc.close();
    }
}

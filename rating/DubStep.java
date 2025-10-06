import java.util.*;

public class DubStep {//208A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String remix = sc.nextLine();

        // Split  string at "WUB"(adhi ochinapdu)
        String[] words = remix.split("WUB");

        
        StringBuilder originalSong = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (originalSong.length() > 0) originalSong.append(" ");
                originalSong.append(word);
            }
        }

        System.out.println(originalSong);

        sc.close();
    }
}

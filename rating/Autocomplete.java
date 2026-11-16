import java.util.*;

public class Autocomplete{//53A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = sc.nextInt();
        
        List<String> matches = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String page = sc.next();
            if (page.startsWith(s)) {
                matches.add(page);
            }
        }
        
        if (matches.isEmpty()) {
            System.out.println(s);
        } else {
            Collections.sort(matches);
            System.out.println(matches.get(0));
        }
    }
}

import java.util.*;

public class BerlandeskRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); //  newline

        HashMap<String, Integer> db = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            if (!db.containsKey(name)) {
                db.put(name, 1);
                System.out.println("OK");
            } else {
                int count = db.get(name);
                String newName = name + count;
                System.out.println(newName);

                db.put(name, count + 1); //
                db.put(newName, 1); // 
            }
        }

        sc.close();
    }
}

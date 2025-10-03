import java.util.*;

public class AlmostLuckyNumber {//122A
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        List<Integer> luckyNumbers = generateLuckyNumbers(1000);

        for (int lucky : luckyNumbers) {
            if (n % lucky == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    static List<Integer> generateLuckyNumbers(int limit) {
        List<Integer> luckyNumbers = new ArrayList<>();
        LinkedList<String> q = new LinkedList<>();
        q.add("4");
        q.add("7");

        while (!q.isEmpty()) {
            String numStr = q.poll();
            int num = Integer.parseInt(numStr);
            if (num > limit) continue;
            luckyNumbers.add(num);

            q.add(numStr + "4");
            q.add(numStr + "7");
        }
        return luckyNumbers;
    }
}
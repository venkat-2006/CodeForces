import java.util.*;

public class WeirdSum {//1648A
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, ArrayList<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> colMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int color = sc.nextInt();

                rowMap.putIfAbsent(color, new ArrayList<>());
                colMap.putIfAbsent(color, new ArrayList<>());

                rowMap.get(color).add(i);
                colMap.get(color).add(j);
            }
        }

        long ans = 0;

        for (int color : rowMap.keySet()) {
            ArrayList<Integer> rows = rowMap.get(color);
            ArrayList<Integer> cols = colMap.get(color);

            Collections.sort(rows);
            Collections.sort(cols);

            long prefix = 0;
            for (int i = 0; i < rows.size(); i++) {
                long val = rows.get(i);
                ans += val * i - prefix;
                prefix += val;
            }

            prefix = 0;
            for (int i = 0; i < cols.size(); i++) {
                long val = cols.get(i);
                ans += val * i - prefix;
                prefix += val;
            }
        }

        System.out.println(ans);
    }
}
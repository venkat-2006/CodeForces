import java.util.*;

public class HelpfulMaths {//339A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        String[] words = x.split("\\+");

        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            nums[i] = Integer.parseInt(words[i]);
        }

        Arrays.sort(nums);

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i != nums.length - 1) {
                sb.append("+");
            }
        }

        System.out.println(sb);

        sc.close();
    }
}

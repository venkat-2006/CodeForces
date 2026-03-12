import java.util.*;

public class SimpleStrings { // 665C

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {

                for (char c = 'a'; c <= 'z'; c++) {

                    if (c != arr[i - 1] && (i + 1 == arr.length || c != arr[i + 1])) {
                        arr[i] = c;
                        break;
                    }
                }

            }
        }

        System.out.println(new String(arr));

        sc.close();
    }
}
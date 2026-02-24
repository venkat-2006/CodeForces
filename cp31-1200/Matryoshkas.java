import java.util.*;

public class Matryoshkas { // 1790D
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            long sets = 0;

            int prevVal = -1;
            int prevFreq = 0;

            int i = 0;
            while (i < n) {
                int val = arr[i];
                int freq = 0;

                while (i < n && arr[i] == val) {
                    freq++;
                    i++;
                }

                if (prevVal + 1 == val) {
                    if (freq > prevFreq)
                        sets += freq - prevFreq;
                } else {
                    sets += freq;
                }

                prevVal = val;
                prevFreq = freq;
            }

            System.out.println(sets);
        }
    }
}
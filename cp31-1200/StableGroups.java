import java.util.*;

public class StableGroups {//1539C
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();

        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        List<Long> gaps = new ArrayList<>();
        int groups = 1;

        for(int i = 1; i < n; i++){
            long diff = a[i] - a[i - 1];
            if(diff > x){
                groups++;
                gaps.add((diff - 1) / x);
            }
        }

        Collections.sort(gaps);

        for(long need : gaps){
            if(k >= need){
                k -= need;
                groups--;
            } else {
                break;
            }
        }

        System.out.println(groups);
        sc.close();
    }
}

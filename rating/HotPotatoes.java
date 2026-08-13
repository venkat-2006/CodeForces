import java.util.*;

public class HotPotatoes { // 2255A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();

        while (t-->0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            long[] arr={a, b, c};
            Arrays.sort(arr);

            System.out.println(Math.min(arr[2]-arr[0],arr[1]));
        }
    }
}
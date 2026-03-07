import java.util.*;

public class StrongVertices {//1857D
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();

       while(t-- > 0){

           int n = sc.nextInt();

           long[] a = new long[n];
           long[] b = new long[n];

           for(int i = 0; i < n; i++) a[i] = sc.nextLong();
           for(int i = 0; i < n; i++) b[i] = sc.nextLong();

           long max = Long.MIN_VALUE;

           for(int i = 0; i < n; i++){
               max = Math.max(max, a[i] - b[i]);
           }

           ArrayList<Integer> ans = new ArrayList<>();

           for(int i = 0; i < n; i++){
               if(a[i] - b[i] == max){
                   ans.add(i + 1);
               }
           }

           System.out.println(ans.size());

           for(int x : ans){
               System.out.print(x + " ");
           }

           System.out.println();
       }

       sc.close();
    }
}
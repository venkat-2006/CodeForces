import java.util.*;
public class DistrictsConnection {//1433D
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0){
            
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            int firstDiff = -1;
            for(int i = 1; i < n; i++){
                if(a[i] != a[0]){
                    firstDiff = i;
                    break;
                }
            }
            
            if(firstDiff == -1){
                System.out.println("NO");
                continue;
            }
            
            System.out.println("YES");
            
            for(int i = 1; i < n; i++){
                if(a[i] != a[0]){
                    System.out.println(1 + " " + (i + 1));
                }
            }
            
            for(int i = 1; i < n; i++){
                if(a[i] == a[0]){
                    System.out.println((firstDiff + 1) + " " + (i + 1));
                }
            }
        }
        sc.close();
    }
}
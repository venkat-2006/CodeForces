import java.util.*;
public class Exams{//479C
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(x,y)->x[0]!=y[0]?x[0]-y[0]:x[1]-y[1]);
        int day=0;
        for(int[] e:a) day=day<=e[1]?e[1]:e[0];
        System.out.println(day);
    }
}

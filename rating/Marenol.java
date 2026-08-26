import java.util.*;

public class Marenol {//2254C1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();

            int ao=0,ae=0,bo=0,be=0;

            for(int i=0;i<n;i++){
                if(a.charAt(i)=='1'){
                    if(i%2==0) ao++;
                    else ae++;
                }
                if(b.charAt(i)=='1'){
                    if(i%2==0) bo++;
                    else be++;
                }
            }

            System.out.println(ao==bo&&ae==be?"YES":"NO");
        }
    }
}
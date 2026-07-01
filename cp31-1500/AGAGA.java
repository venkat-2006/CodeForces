import java.util.*;

public class AGAGA {//1516B
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];

            int total=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                total^=a[i];
            }

            if(total==0){
                System.out.println("YES");
                continue;
            }

            int prefix=0;
            boolean foundFirst=false;
            boolean ok=false;

            for(int i=0;i<n-1;i++){
                prefix^=a[i];
                if(!foundFirst){
                    if(prefix==total){
                        foundFirst=true;
                    }
                }
                else{
                    if(prefix==0){
                        ok=true;
                        break;
                    }
                }
            }

            System.out.println(ok?"YES":"NO");
        }

        sc.close();
    }
}
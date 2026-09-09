import java.util.*;

public class EraseAndExtend {//1537E1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        String s=sc.next(), ans="";

        for(int len=1;len<=n;len++){
            StringBuilder cur=new StringBuilder();
            for(int i=0;i<k;i++)
                cur.append(s.charAt(i%len));

            String x=cur.toString();
            if(ans.equals("")||x.compareTo(ans)<0)
                ans=x;
        }
        System.out.println(ans);
    }
}

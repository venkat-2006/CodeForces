import java.util.*;

public class Delete {//2248A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            String s=sc.next();

            int p=s.indexOf("01");
            if(p!=-1)
                s=s.substring(0,p)+s.substring(p+1);
            else {
                p=s.lastIndexOf("0");
                s=s.substring(0,p)+s.substring(p+1);
            }

            p=s.indexOf("10");
            if(p!=-1)
                s=s.substring(0,p)+s.substring(p+1);
            else {
                p=s.indexOf("1");
                s=s.substring(0,p)+s.substring(p+1);
            }

            System.out.println(s);
        }
    }
}
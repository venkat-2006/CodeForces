import java.util.*;

public class DecreasingString {//1886C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            String s=sc.next();
            long pos=sc.nextLong();
            int n=s.length(),del=0;

            while(pos>n-del){
                pos-=n-del;
                del++;
            }

            StringBuilder sb=new StringBuilder();

            for(char c:s.toCharArray()){
                while(del>0&&sb.length()>0&&sb.charAt(sb.length()-1)>c){
                    sb.deleteCharAt(sb.length()-1);
                    del--;
                }
                sb.append(c);
            }

            while(del>0){
                sb.deleteCharAt(sb.length()-1);
                del--;
            }

            System.out.print(sb.charAt((int)pos-1));
        }
        sc.close();
    }
}
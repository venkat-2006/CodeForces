import java.util.*;

public class Abbre {//2257A
    static void solve(Scanner sc){
        int n=sc.nextInt(),m=sc.nextInt();
        boolean[] available=new boolean[26];

        for(int i=0;i<n;i++){
            String s=sc.next();
            available[s.charAt(0)-'a']=true;
        }

        boolean ok=true;

        for(int i=0;i<m;i++){
            String abbreviation=sc.next();

            for(char c:abbreviation.toCharArray()){
                if(!available[c-'A']){
                    ok=false;
                }
            }
        }

        System.out.println(ok?"YES":"NO");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tests=sc.nextInt();

        while(tests-->0)
            solve(sc);
    }
}
import java.util.Scanner;

public class Pangram {//520A
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String y=sc.next().toLowerCase();
        int hash[]=new int[26];

        for(int i=0;i<y.length();i++){
            hash[y.charAt(i)-'a']++;
            

        }
        boolean a=false;
        for(int i=0;i<hash.length;i++){
            if(hash[i]==0){
                a=true;
                break;

            }
        }
        if(a){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        sc.close();
    }
    
}

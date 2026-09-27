import java.util.*;

public class RegularBracketSequence{//26B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int open=0,ans=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                    ans+=2;
                }
            }
        }

        System.out.println(ans);
    }
}

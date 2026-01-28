import java.util.*;
public class CardDeck {//1511C
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        
        int pos[] =new int[51];
        Arrays.fill(pos,-1);

        for(int i=1;i<=n;i++){
            int color=sc.nextInt();
            if(pos[color]==-1){
                pos[color]=i;

            }
        }
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<q;i++){
            int curr=sc.nextInt();
            int currPos=pos[curr];
            ans.append(currPos+" ");

            for(int j=1;j<=50;j++){
                if(pos[j]!=-1 && pos[j]<currPos){
                    pos[j]++;
                }
            }
            pos[curr]=1;
        }
        System.out.println(ans.toString());
        
    }
    
}

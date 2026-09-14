import java.util.*;

public class EqualFre{//1781C
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            char[]s=sc.next().toCharArray();
            int[]f=new int[26];
            for(char c:s)f[c-'a']++;
            int best=n,bk=1;

            for(int k=1;k<=26;k++){
                if(n%k!=0)continue;
                int x=n/k,keep=0;
                Integer[]a=new Integer[26];
                for(int i=0;i<26;i++)a[i]=i;
                Arrays.sort(a,(i,j)->f[j]-f[i]);
                for(int i=0;i<k;i++)keep+=Math.min(f[a[i]],x);
                if(n-keep<best){best=n-keep;bk=k;}
            }

            Integer[]a=new Integer[26];
            for(int i=0;i<26;i++)a[i]=i;
            Arrays.sort(a,(i,j)->f[j]-f[i]);

            int x=n/bk;
            boolean[]ok=new boolean[26];
            int[]need=new int[26];
            for(int i=0;i<bk;i++){ok[a[i]]=true;need[a[i]]=x;}

            ArrayList<Integer>change=new ArrayList<>();
            for(int i=0;i<n;i++){
                int c=s[i]-'a';
                if(ok[c]&&need[c]>0)need[c]--;
                else change.add(i);
            }

            int p=0;
            for(int c=0;c<26;c++)
                while(need[c]>0){
                    s[change.get(p++)]=(char)('a'+c);
                    need[c]--;
                }

            System.out.println(best);
            System.out.println(s);
        }
    }
}

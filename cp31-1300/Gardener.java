import java.util.*;

public class Gardener {//1775B
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();

            List<List<Integer>> x=new ArrayList<>();
            Map<Integer,Integer> map=new HashMap<>();

            for(int i=0;i<n;i++){

                int k=sc.nextInt();
                List<Integer> bits=new ArrayList<>();

                for(int j=0;j<k;j++){
                    int b=sc.nextInt();
                    bits.add(b);
                    map.put(b,map.getOrDefault(b,0)+1);
                }

                x.add(bits);
            }

            boolean ok=false;

            for(List<Integer> z:x){

                boolean hasUnique=false;

                for(int b:z){
                    if(map.get(b)==1){
                        hasUnique=true;
                        break;
                    }
                }

                if(!hasUnique){
                    ok=true;
                    break;
                }
            }

            if(ok) System.out.println("Yes");
            else System.out.println("No");
        }

        sc.close();
    }
}
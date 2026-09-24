import java.util.*;

public class BattleofArrays{//2181B
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();

            PriorityQueue<Long> a=new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Long> b=new PriorityQueue<>(Collections.reverseOrder());

            for(int i=0;i<n;i++) a.add(sc.nextLong());
            for(int i=0;i<m;i++) b.add(sc.nextLong());

            boolean alice=true;

            while(!a.isEmpty()&&!b.isEmpty()){
                if(alice){
                    long x=a.peek();
                    long y=b.poll();

                    if(y>x) b.add(y-x);

                    alice=false;
                }else{
                    long x=b.peek();
                    long y=a.poll();

                    if(y>x) a.add(y-x);

                    alice=true;
                }
            }

            System.out.println(a.isEmpty()?"Bob":"Alice");
        }
    }
}

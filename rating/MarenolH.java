import java.util.*; 
 
public class Marenol {//2254C2 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
 
        while(t-->0){ 
            int n=sc.nextInt(); 
            String a=sc.next(); 
            String b=sc.next(); 
 
            ArrayList<Integer> ao=new ArrayList<>(); 
            ArrayList<Integer> ae=new ArrayList<>(); 
            ArrayList<Integer> bo=new ArrayList<>(); 
            ArrayList<Integer> be=new ArrayList<>(); 
 
            for(int i=0;i<n;i++){ 
                if(a.charAt(i)=='1'){ 
                    if(i%2==0) ao.add(i); 
                    else ae.add(i); 
                } 
 
                if(b.charAt(i)=='1'){ 
                    if(i%2==0) bo.add(i); 
                    else be.add(i); 
                } 
            } 
 
            if(ao.size()!=bo.size() || ae.size()!=be.size()){ 
                System.out.println(-1); 
                continue; 
            } 
 
            long ans=0; 
 
            for(int i=0;i<ao.size();i++){ 
                ans+=Math.abs(ao.get(i)-bo.get(i))/2; 
            } 
 
            for(int i=0;i<ae.size();i++){ 
                ans+=Math.abs(ae.get(i)-be.get(i))/2; 
            } 
 
            System.out.println(ans); 
        } 
    } 
}

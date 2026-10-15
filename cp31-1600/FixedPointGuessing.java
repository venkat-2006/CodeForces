

import java.util.*;
public class FixedPointGuessing{//1698D
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=1,r=n;
            while(l<r){
                int mid=(l+r)/2;
                System.out.println("? "+l+" "+mid);
                System.out.flush();
                int count=0;
                for(int i=l;i<=mid;i++){
                    int x=sc.nextInt();
                    if(x>=l&&x<=mid)count++;
                }
                if(count%2==1)r=mid;
                else l=mid+1;
            }
            System.out.println("! "+l);
            System.out.flush();
        }
    }
}

import java.util.*;
public class Solution{//1420B
    public static void main(String args[]){//a + b = (a ^ b) + 2*(a & b)
          Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          while(x-->0){

              int n = sc.nextInt();
              long[] freq = new long[32];

              for(int i = 0; i < n; i++){
                  int num = sc.nextInt();
                  int msb = 31 - Integer.numberOfLeadingZeros(num);
                  freq[msb]++;
              }

              long ans = 0;
              for(int i = 0; i < 32; i++){
                  ans += freq[i] * (freq[i] - 1) / 2;
              }

              System.out.println(ans);
          }
          sc.close();
    }
}
// import java.util.*;

// public class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         boolean isPrime[] = new boolean[n + 1];
//         Arrays.fill(isPrime, true);

//         if(n >= 0) isPrime[0] = false;
//         if(n >= 1) isPrime[1] = false;

//         for(int i = 2; i * i <= n; i++) {
//             if(isPrime[i]) {
//                 for(int j = i * i; j <= n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         for(int i = 0; i <= n; i++) {
//             if(isPrime[i])
//                 System.out.print(i + " ");
//         }
//     }
// }
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int L=sc.nextInt();
//         int R=sc.nextInt();
//         int n=(int)Math.sqrt(R);
//         boolean a[]=new boolean[n+1];
//         Arrays.fill(a,true);
//         for(int i=2;i*i<=n;i++){
//             if(a[i]){
//                 for(int j=i*i;j<=n;j+=i){
//                       a[j]=false;
//                 }
//             }

//         }
//         boolean prime[]=new boolean[R-L+1];
//         Arrays.fill(prime,true);
//         for(int i=2;i<=n;i++){
//             if(a[i]){
//                 int start=Math.max(i*i,((i+L-1)/i)*i);

//                 for(int j=start;j<=R;j+=i){
//                     prime[j-L]=false;
//                 }
//             }
//         }
//         if(L==1){
//             prime[0]=false;
//         }

//         for(int i=0;i<=R-L;i++){
//             if(prime[i]){
//                 System.out.print(i+L+" ");
//             }
//         }

//     }
// }

import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while()
            }
        }

    }
}
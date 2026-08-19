// // // // import java.util.*;

// // // // public class practice {
// // // //     public static void main(String args[]) {
// // // //         Scanner sc = new Scanner(System.in);
// // // //         int n = sc.nextInt();

// // // //         boolean isPrime[] = new boolean[n + 1];
// // // //         Arrays.fill(isPrime, true);

// // // //         if(n >= 0) isPrime[0] = false;
// // // //         if(n >= 1) isPrime[1] = false;

// // // //         for(int i = 2; i * i <= n; i++) {
// // // //             if(isPrime[i]) {
// // // //                 for(int j = i * i; j <= n; j += i) {
// // // //                     isPrime[j] = false;
// // // //                 }
// // // //             }
// // // //         }

// // // //         for(int i = 0; i <= n; i++) {
// // // //             if(isPrime[i])
// // // //                 System.out.print(i + " ");
// // // //         }
// // // //     }
// // // // }
// // // // import java.util.*;
// // // // public class practice{
// // // //     public static void main(String args[]){
// // // //         Scanner sc=new Scanner(System.in);
// // // //         int L=sc.nextInt();
// // // //         int R=sc.nextInt();
// // // //         int n=(int)Math.sqrt(R);
// // // //         boolean a[]=new boolean[n+1];
// // // //         Arrays.fill(a,true);
// // // //         for(int i=2;i*i<=n;i++){
// // // //             if(a[i]){
// // // //                 for(int j=i*i;j<=n;j+=i){
// // // //                       a[j]=false;
// // // //                 }
// // // //             }

// // // //         }
// // // //         boolean prime[]=new boolean[R-L+1];
// // // //         Arrays.fill(prime,true);
// // // //         for(int i=2;i<=n;i++){
// // // //             if(a[i]){
// // // //                 int start=Math.max(i*i,((i+L-1)/i)*i);

// // // //                 for(int j=start;j<=R;j+=i){
// // // //                     prime[j-L]=false;
// // // //                 }
// // // //             }
// // // //         }
// // // //         if(L==1){
// // // //             prime[0]=false;
// // // //         }

// // // //         for(int i=0;i<=R-L;i++){
// // // //             if(prime[i]){
// // // //                 System.out.print(i+L+" ");
// // // //             }
// // // //         }

// // // //     }
// // // // }

// // // import java.util.*;
// // // public class practice{
// // //     public static void main(String args[]){
// // //         Scanner sc=new Scanner(System.in);
// // //         int n=sc.nextInt();
// // //         int r=n;
// // //         for(int i=2;i*i<=n;i++){
// // //             if(n%i==0){
// // //                 while(n%i==0){
// // //                     n/=i;
// // //                 }
// // //                 r-=r/i;
// // //             }
// // //         }
// // //         if(n>1){
// // //             r-=r/n;
// // //         }
// // //         System.out.println(r);

// // //     }
// // // }
// // // import java.util.*;
// // // public class practice{
// // //     public static void main(String args[]){
// // //         Scanner sc=new Scanner(System.in);
// // //         String s=sc.nextLine();
// // //         int l=0;
// // //         int r=s.length()-1;
// // //         boolean x=true;
// // //         while(l<r){
// // //             if(!((s.charAt(l)=='0'&&s.charAt(r)=='0')||(s.charAt(l)=='1'&&s.charAt(r)=='1')||(s.charAt(l)=='8'&&s.charAt(r)=='8')||(s.charAt(l)=='6'&&s.charAt(r)=='9')||(s.charAt(l)=='9'&&s.charAt(r)=='6'))){
// // //                 x=false;
// // //             }
// // //             l++;
// // //             r--;
// // //         }
// // //         if(x){
// // //             System.out.print("stro");
// // //         }else{
// // //             System.out.print("not stro");
// // //         }

// // //     }
// // // }

// // import java.util.*;
// // public class practice{
// //     public static void main(String args[]){
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();

// //         int rem[]=new int[n];
// //         int mod[]=new int[n];

// //         for(int i=0;i<n;i++){
// //             rem[i]=sc.nextInt();
// //             mod[i]=sc.nextInt();
// //         }
// //         int M=1;
// //         for(int i=0;i<n;i++){
// //             M*=mod[i];
// //         }
// //         int ans=0;
// //         for(int i=0;i<n;i++){
// //             int Mi=M/mod[i];
// //             int inv=inv(Mi,mod[i]);
// //             ans+=rem[i]*inv*Mi;

// //         }
// //         ans%=M;
// //         System.out.println(ans);




// //     }
// //     static int inv(int a,int m){
// //         for(int x=1;x<m;x++){2 
// //             if((a*x)%m==1){
// //                 return x;
// //             }
// //         }
// //         return 1;
// //     }
// // }
// import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         String s = Integer.toBinaryString(n);

//         int l = 0, r = s.length() - 1;
//         boolean p = true;

//         while(l < r) {
//             if(s.charAt(l) != s.charAt(r)) {
//                 p = false;
//                 break;
//             }
//             l++;
//             r--;
//         }

//         if(p)
//             System.out.println("Yes");
//         else
//             System.out.println("No");
//     }
// }

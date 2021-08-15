package Practices;
// package Practice;
// import java.util.Scanner;
// public class ThreePartitions {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n=in.nextInt();
//         int [] x=new int[n];
//         int [] res=new int [n];
//         System.out.println("enter the elemets of the array:");
//         int i;
//         for(i=0; i<n; i++){
//             x[i]=in.nextInt();
//         }
//         System.out.println("enter the range ");
//         int a=in.nextInt();
//         int b=in.nextInt();
//         int p=0;
//         i=0;
//         while( p<n){
//             if(x[i]>=a){
//                 res[p]=x[i];
//                 p++;
//             }
//             i++;
//         }
//         i=0;
//         while( p<n){
//             if(x[i]>a&&x[i]<b){
//                 res[p]=x[i];
//                 p++;
//             }
//             i++;
//         }
//         i=0;
//         while(p<n){
//             if(x[i]>=b){
//                 res[p]=x[i];
//                 p++;
//             }
//             i++;
//         }
//         for(int item:x){ 
//             System.out.print(item+" ");
//         }
//         in.close();
//     }
// }

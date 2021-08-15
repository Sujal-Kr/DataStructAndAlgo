package GeeksForGeeks;
// package gog;
// import java.util.Scanner;
// public  class Product {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Size:");
//         int n=in.nextInt();
//         int i;
//         int[] pro=new int[n];
//         int[] x=new int[n];
//         System.out.println("Enter your array elements");
//         if(n==1){
//             return;
//         }
//         for(i=0; i<n; i++){
//             x[i]=in.nextInt();
//         }
//         for(i=0; i<n; i++){
//             pro[i]=1;
//         }
//         for(i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(i==j){
//                     continue;
//                 }
//                 pro[i]*=x[j];
//             }
//         }
//         for(int j=0; j<n; j++){
//             System.out.print(pro[j]+" ");
//         }
//         in.close();
//     }
// }

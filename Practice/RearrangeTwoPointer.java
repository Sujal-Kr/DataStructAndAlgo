package Practice;

import java.util.Scanner;
public class RearrangeTwoPointer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n =in.nextInt();
        int[] x=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            x[i] = in.nextInt();
        }
        int[] temp = new int[n];
        int p=0;
        if(n%2==0){
            for(int i=0,j=n-1;i<n/2;i++,j--){
                temp[p]=x[j];
                p++;
                temp[p]=x[i];
                p++;
            }
        }
        else{
            for(int i=0,j=n-1;i<n/2;i++,j--){
                temp[p]=x[j];
                p++;
                temp[p]=x[i];
                p++;
            }
                temp[p]=(x[n/2]);
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
        in.close();
    }
}

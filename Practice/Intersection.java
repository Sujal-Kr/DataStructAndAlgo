package Practice;

import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of 1st and the 2nd array");
        int n=in.nextInt();
        int m=in.nextInt();
        System.out.println("enter the array element");
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=in.nextInt();
        }
        int[] y=new int[m];
        System.out.println("enter the elements of 2nd array");
        for(int i=0;i<m;i++){
            y[i]=in.nextInt();
        }
        int i=0,j=0;
        Arrays.sort(x);
        Arrays.sort(y);

        System.out.print("intersection of two arrays: ");
        while(i<n&&j<m){
            if(x[i]==y[j]){
                System.out.print(x[i]+" ");
                i++;
                j++;
                
            }
            else if(x[i]>y[j]){
                j++;
            }
            else{
                i++;
            }
        }
        
        in.close();
    }
    
}

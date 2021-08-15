package Practices;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the arrays:");
        int n =in.nextInt();
        int a[]=new int[n];
        System.out.println("enter Sorted array elements.");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the element to be searched.");
        int k=in.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==k){
                System.out.println("Element is at index "+mid);
                break;
            }
            else if(a[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        in.close();

    }
    
}

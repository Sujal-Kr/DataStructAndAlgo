
import java.util.Scanner;
public class RearrangeArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements:");
        
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        //Cyclic Rotation.
        int j=0;
        for(int i=0; i<n; i+=2){
            int temp=arr[n-1];
            for(j=n-1;j>i;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
        }
            
        for(int s=0; s<n; s++){
            System.out.print(arr[s]+" ");
        }
        
        in.close();
    }
    
}

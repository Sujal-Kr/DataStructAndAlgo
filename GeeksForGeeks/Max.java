package GeeksForGeeks;
import java.util.Scanner;
public class Max {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        System.out.println("Enter the value of r:");
        int r=in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        } 
        for (int i=n-1; i>n-1-r; i--){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
    
}

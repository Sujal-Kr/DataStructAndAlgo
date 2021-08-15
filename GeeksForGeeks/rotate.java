package GeeksForGeeks;
import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Enter the value of 'r':");
        int r= in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        
        for(int i=1; i<=r; i++){
            int temp=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
    
}

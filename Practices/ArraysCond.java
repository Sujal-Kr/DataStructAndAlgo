
import java.util.Scanner;
public class ArraysCond {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of arrays:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        System.out.println("pairs:");
        for(int i=0; i<n; i++){
            int x=i*a[i];
            for(int j=0; j<n; j++){
            int y=j*a[j];
            System.out.print(x+y+",");
            }
        }
        in.close();
    }
    
}

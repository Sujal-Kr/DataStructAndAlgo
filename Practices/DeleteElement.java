
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        System.out.println("Enter array elements");
        int[] x=new int[size];
        for(int i=0; i<size; i++){
            x[i] = in.nextInt();
        }
        //x[3]=
        in.close();
    }
}

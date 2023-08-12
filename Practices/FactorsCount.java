
import java.util.Scanner;
public class FactorsCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("enter element of the array");
        int pro=1;
        for (int i=0;i<n;i++) {
            array[i] = in.nextInt();
            pro*=array[i];
        }int count=0;
        for(int i=1;i<=pro/2;i++) {
            if(pro%i == 0){
                count++; 
            }

        }
        System.out.println("No of Factors="+(count+1));
        in.close();
    }
    
}

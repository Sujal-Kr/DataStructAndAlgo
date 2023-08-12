
import java.util.*;
public class findThreeSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements.");
        for (int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        Sum objects = new Sum();
        System.out.println(objects.ThreeSum(a));
        in.close();
    }
}
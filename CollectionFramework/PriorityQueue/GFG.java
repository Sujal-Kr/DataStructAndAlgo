package CollectionFramework.PriorityQueue;
import java.util.*;
public class GFG {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] x=new int[n];
        System.out.println("enter the elemets of the array");
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        
        in.close();
    }
    
}

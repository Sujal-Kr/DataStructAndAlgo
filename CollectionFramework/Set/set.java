package CollectionFramework.Set;
import java.util.*;
public class set{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        System.out.println("Enter the arrat elements");
        int[] x=new int[n];
        boolean found=false;
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        System.out.println("enter the value of X");
        int X=in.nextInt();
        // for(int i=0; i<n; i++){
        //     int sum=0;
        //     for(int j=i; j<n; j++){
        //         sum+=x[j];
        //         if(sum==0){
        //             found=true;
        //             break;
        //         }
        //     }
        // }
        // System.out.println(found);
        
        Set<Integer> sum=new HashSet<Integer>();
        int S=0;
        for(int i=0; i<n; i++){
            sum.add(S);
            S+=x[i];
            if(sum.contains(S-X)){
                found=true;
            }
        }
        System.out.println(found);
        in.close();
    }
}
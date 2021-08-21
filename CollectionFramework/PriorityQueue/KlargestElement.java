package CollectionFramework.PriorityQueue;
import java.util.*;
public class KlargestElement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Size of  the Array");
        int n=in.nextInt();
        System.out.println("Enter the value of K");
        int k=in.nextInt();
        int [] num=new int[n];
        System.out.println("Enter the elements of the Array");
        for(int i=0; i<n; i++){
            num[i]=in.nextInt();
        }
        PriorityQueue<Integer> x=new PriorityQueue<>();
        for(int i=0; i<n; i++){
            if(i<k){
                x.add(num[i]);
            }
            else{
                if(x.peek()<num[i]){
                    x.remove();
                    x.add(num[i]);
                }
            }
        }
        System.out.println(x);
        in.close();
    }
    
}

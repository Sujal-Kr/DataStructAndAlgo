package CollectionFramework.PriorityQueue;
import java.util.*;
public class SmallestKthelement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] x=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            x[i]=in.nextInt();
        }
        System.out.println("enter the value of K");
        int k=in.nextInt();
        PriorityQueue<Integer> Q =new PriorityQueue<>();
        for(int i=0;i<n;i++){
            Q.add(x[i]);
        }
        for(int i=1;i<=n;i++){
            if(i==k){
                System.out.println(Q.element());
            }
            Q.remove();
        }
        in.close();
    }
}


import java.util.*;
public class SlidingWindow {
    public static int max(LinkedList<Integer> x) {
        int max=0;
        for(int i=0; i<x.size(); i++){
            if(x.get(i)>max){
                max=x.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] x=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        System.out.println("Enter the size of the Window:");
        int k =in.nextInt();
        LinkedList <Integer> win=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            if(i<k){
                win.addLast(x[i]);
            }
            else{
                System.out.print(max(win)+" ");
                win.remove(0);
                win.add(x[i]);
            }        
        }
        System.out.println(max(win));
        in.close();

    }
}

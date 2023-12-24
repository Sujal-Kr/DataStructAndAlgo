package GeeksForGeeks;
import java.util.*;
public class MaximumOfAllSubarrayOfSizeK {
    public static void main(String[] args) {
        int arr[]={1,2, 3, 1, 4, 5, 2, 3, 6};
        int k=3;
        System.out.println(solution(arr,k));       
    }

    private static ArrayList<Integer> solution(int[] arr,int k) {
        ArrayDeque<Integer> x=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<k;i++) {
            while(!x.isEmpty()&&arr[x.peekLast()]<=arr[i])x.removeLast();
            x.addLast(i);
            
        }
        for(int i=k;i<arr.length;i++){
            
            list.add(arr[x.peekFirst()]);
            while(!x.isEmpty()&&x.peekFirst()<=i-k)x.removeFirst();
            while(!x.isEmpty()&&arr[x.peekLast()]<=arr[i])x.removeLast();
            x.addLast(i);
        }
        list.add(arr[x.peekFirst()]);
        return list;
    }
}

package GeeksForGeeks;
import java.util.*;
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int k=12;
        solution(arr,k);
    }
    private  static ArrayList<Integer> solution(int[] arr,int k) {
        int count[]=new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            count[i]+=arr[i];
        }
        for(int item:count){
            System.out.println(item);
        }
        return null;
    }
}

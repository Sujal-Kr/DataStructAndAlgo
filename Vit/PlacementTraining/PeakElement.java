package Vit.PlacementTraining;
import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        int arr[]={1,34,89,49,90};
        System.out.println(solution(arr));
    }
    public static List<Integer> solution(int []arr) {
        List<Integer> res = new ArrayList<Integer>();
        int index = 0;
        int max=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(max<arr[i]){
                index=i;
                max=arr[i];
            }
        }
        res.add(max);
        res.add(index);
        return res;
    }
}
